package com.javarush.module2.facultative3.cuncurrency.utils;

import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public final class HashUtils {

    private HashUtils(){

    }

    public static String hash(String toHash) {
        Hasher hasher = Hashing.md5().newHasher();
        hasher.putString(toHash, StandardCharsets.UTF_8);
        return hasher.hash().toString();
    }

    public static void main(String[] args) {
        System.out.println(hash("Hello_javarush"));
    }
}
