package com.javarush.module2.facultative3.cuncurrency.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TimeUtils {

    public static String timeStr(long mills) {
        long millis = mills % 1000;
        long second = (mills / 1000) % 60;
        long minute = (mills / (1000 * 60)) % 60;
        long hour = (mills / (1000 * 60 * 60)) % 24;

        return  String.format("%02d:%02d:%02d.%d", hour, minute, second, millis);
    }
}
