package com.practice.java._22javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _3JavaBufferedOutputStreamAndBufferedInputStream {

    /*
    Java BufferedOutputStream class is used for buffering an output stream.
    It internally uses buffer to store data. It adds more efficiency than
    to write data directly into a stream. So, it makes the performance fast.
    Java BufferedOutputStream extends FilterOutputStream.

    Java BufferedInputStream class is used to read information from stream.
    It internally uses buffer mechanism to make the performance fast.
    Java BufferedInputStream extends FilterInputStream.
    */
    public static void main(String args[])throws Exception{
        FileOutputStream fileOutputStream=new FileOutputStream("JavaBufferedOutputStreamAndBufferedInputStream.txt");
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        String s="Welcome to Java";
        byte b[]=s.getBytes();
        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("success");

        FileInputStream fileInputStream=new FileInputStream("JavaBufferedOutputStreamAndBufferedInputStream.txt");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        int i;
        while((i=bufferedInputStream.read())!=-1){
            System.out.print((char)i);
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
