package com.practice.java._22javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _3JavaBufferedOutputStreamAndBufferedInputStream {

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
