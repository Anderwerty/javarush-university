package com.javarush.module2.facultative3.cuncurrency.service;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.javarush.module2.facultative3.cuncurrency.CallableStringChecker;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MultiThreadUnHashService implements UnHashService {
    private static final int N_THREADS = 26;

    @Override
    public String unHash(String hash) throws Exception {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);

        ExecutorService executorService = Executors.newFixedThreadPool(N_THREADS,
                runnable -> new ThreadFactoryBuilder()
                        .setDaemon(true)
                        .build()
                        .newThread(runnable)
        );

        List<Callable<String>> callables = IntStream.range(0, N_THREADS)
                .mapToObj(i -> new CallableStringChecker(hash, i, atomicBoolean))
                .collect(toList());

        String result = executorService.invokeAny(callables);
        executorService.shutdown();

        return result;
    }
}
