package com.javarush.module2.project.facultative2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Runner {
    public static void main(String[] args) throws UnknownHostException {

//        Island island = new Island(100, 100);
//        island.print();
//        island.initialize();
//        island.print();
        System.getProperties().forEach((k, v) -> System.out.println(k + ":" + v));

        System.out.println(InetAddress.getLocalHost().getHostName());

    }

    public static void EnumerateUsers() {



    }


}
