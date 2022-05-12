package com.javarush.modul1.lesson26;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExampleA {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/main/resources/file.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(48);

        int bytesRead = channel.read(byteBuffer);
        while (bytesRead != -1) {

            System.out.println("Read " + bytesRead);
            byteBuffer.flip();

            byte[] bytes = new byte[bytesRead];
            int index = 0;
            while (byteBuffer.hasRemaining()) {
                bytes[index++] = byteBuffer.get();
            }
            System.out.println("Read: " + new String(bytes));

            byteBuffer.clear();
            bytesRead = channel.read(byteBuffer);
        }
        randomAccessFile.close();
    }
}
