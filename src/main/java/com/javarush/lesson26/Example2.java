package com.javarush.lesson26;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/main/resources/file.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(64);

        int numberOfBytes = channel.read(buffer); // -1
        while (numberOfBytes != -1) {
            buffer.flip();

            byte[] bytes = new byte[numberOfBytes];
            int index = 0;
            while (buffer.hasRemaining()) {
                bytes[index++] = buffer.get();
            }

            System.out.println(new String(bytes));

            buffer.clear();
            numberOfBytes = channel.read(buffer);
        }

    }
}
