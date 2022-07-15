package com.javarush.module2.facultative2.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.UNORDERED;

public class Example2 {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5);
        Integer sum = integers.stream().collect(new SumCollector());
        System.out.println("Sum: " + sum);


        System.out.println("================================================");
        LinkedListContainer<Integer> items = new LinkedListContainer<>(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5);
        items.forEach(x -> System.out.println(x));

    }
}

// custom container
class LinkedListContainer<E> implements Iterable<E> {

    private final Node<E> head = new Node<>(null, null);

    private int size = 0;

    public LinkedListContainer() {
    }

    public LinkedListContainer(E... items) {
        // not effective implementation
        for (E item : items) {
            add(item);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> currentNode = head.nextNode;

            @Override
            public boolean hasNext() {
                return currentNode.hashNext();
            }

            @Override
            public E next() {
                E value = currentNode.value;
                currentNode = currentNode.nextNode;
                return value;
            }
        };
    }

    static class Node<T> {
        T value;
        Node<T> nextNode;

        public Node(T value, Node<T> nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        public boolean hashNext() {
            return nextNode != null;
        }
    }

    public void add(E element) {
        Node<E> currentNode = head;

        while (currentNode.hashNext()) {
            currentNode = currentNode.nextNode;
        }

        Node<E> node = new Node<>(element, null);
        currentNode.nextNode = node;
        size++;
    }

    public int size() {
        return size;
    }

    public E getByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        Node<E> currentNode = head;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.nextNode;
        }

        return currentNode.value;
    }

    public void merge(LinkedListContainer<E> that) {
        if (that.size == 0) {
            return;
        }

        Node<E> thatStartNode = that.head.nextNode;

        Node<E> currentNode = head;

        while (currentNode.hashNext()) {
            currentNode = currentNode.nextNode;
        }

        currentNode.nextNode = thatStartNode;

        this.size += that.size;
    }
}


class SumCollector implements Collector<Integer, LinkedListContainer<Integer>, Integer> {

    //how create container
    @Override
    public Supplier<LinkedListContainer<Integer>> supplier() {
        return LinkedListContainer::new;
    }

    // add item into container
    @Override
    public BiConsumer<LinkedListContainer<Integer>, Integer> accumulator() {
        return LinkedListContainer::add;
    }

    // merge 2 containers
    @Override
    public BinaryOperator<LinkedListContainer<Integer>> combiner() {
        return (items1, items2) -> {
            items1.merge(items2);
            return items1;
        };
    }

    //calculate sum
    @Override
    public Function<LinkedListContainer<Integer>, Integer> finisher() {
        return (items) -> {
            int sum = 0;
            for (Integer item : items) {
                sum += item;
            }

            return sum;
        };
    }

    //don't take about order
    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(UNORDERED);
    }
}
