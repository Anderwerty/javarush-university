package com.javarush.module2.facultative3.cuncurrency.service;

import com.javarush.module2.facultative3.cuncurrency.CallableStringChecker;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ForkJoinUnHashService implements UnHashService {
    private static final int N_THREADS = 26; //

    @Override
    public String unHash(String hash) throws Exception {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);

        ForkJoinPool forkJoinPool = new ForkJoinPool(N_THREADS);

        List<Callable<String>> callables = IntStream.range(0, N_THREADS)
                .mapToObj(i -> new CallableStringChecker(hash, i, atomicBoolean))
                .collect(toList());

        String result = forkJoinPool.invokeAny(callables);
        forkJoinPool.shutdown();

        return result;
    }
}
