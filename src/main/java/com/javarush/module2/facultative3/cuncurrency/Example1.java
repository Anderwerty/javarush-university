package com.javarush.module2.facultative3.cuncurrency;


import com.javarush.module2.facultative3.cuncurrency.service.ForkJoinUnHashService;
import com.javarush.module2.facultative3.cuncurrency.service.MultiThreadUnHashService;
import com.javarush.module2.facultative3.cuncurrency.service.UnHashService;
import com.javarush.module2.facultative3.cuncurrency.utils.HashUtils;

import static com.javarush.module2.facultative3.cuncurrency.utils.TimeUtils.timeStr;

public class Example1 {
    public static void main(String[] args) throws Exception {
        UnHashService multiThreadUnHashService = new MultiThreadUnHashService();
        UnHashService forkJoinHashService = new ForkJoinUnHashService();

        String password = "zbzxaa";

        String hash = HashUtils.hash(password);

        long start = System.currentTimeMillis();
        String result = multiThreadUnHashService.unHash(hash);
        long end = System.currentTimeMillis();

        System.out.println(String.format("Executor Result: %s  it took %s", result, timeStr(end - start)));


        start = System.currentTimeMillis();
        result = forkJoinHashService.unHash(hash);
        end = System.currentTimeMillis();

        System.out.println(String.format("Fork Join Pool Result: %s  it took %s", result, timeStr(end - start)));


    }
}
