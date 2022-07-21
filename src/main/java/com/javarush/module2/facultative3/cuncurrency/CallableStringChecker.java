package com.javarush.module2.facultative3.cuncurrency;

import com.javarush.module2.facultative3.cuncurrency.utils.HashUtils;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

import static java.lang.Math.pow;

public class CallableStringChecker implements Callable<String> {
    private static final int SYMBOL_NUMBER = 26;
    private static final int MAX_SIZE = 7;

    private String hash;
    private int first;
    private AtomicBoolean atomicBoolean;

    public CallableStringChecker(String hash, int first, AtomicBoolean atomicBoolean) {
        this.hash = hash;
        this.first = first;
        this.atomicBoolean = atomicBoolean;
    }

    @Override
    public String call() {
        return findString();
    }

    private String findString() {
        for (int k = 0; k < MAX_SIZE && !atomicBoolean.get(); k++) {
            int total = (int) pow(SYMBOL_NUMBER, k);
            int[] intArr = new int[k];
            for (int value = 0; value < total && !atomicBoolean.get(); value++) {
                generateArray(k, intArr, value);

                String str = toString(intArr);

                if (compareHashes(str)) {
                    atomicBoolean.set(true);
                    return str;
                }
            }
        }
        throw new RuntimeException();
    }

    private boolean compareHashes(String str) {
        return HashUtils.hash(str).equals(hash);
    }

    private void generateArray(int k, int[] intArr, int value) {
        int remain = value;
        for (int i = k - 1; i >= 0; i--) {
            intArr[i] = remain % SYMBOL_NUMBER;
            remain /= SYMBOL_NUMBER;
        }
    }

    private String toString(int[] arr) {
        char[] chars = new char[arr.length + 1];

        chars[0] = (char) (first + 'a');
        IntStream.range(0, arr.length).forEach(i -> chars[i + 1] = (char) (arr[i] + 'a'));

        return String.valueOf(chars);
    }
}
