package com.practice.java._22javaio;

import java.io.*;

public class _2JavaBufferWriterAndReader {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("JavaBufferWriterAndReaderFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hi All");
            bufferedWriter.newLine();
            bufferedWriter.write("First Text File");

            bufferedWriter.close();

            FileReader reader = new FileReader("JavaBufferWriterAndReaderFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
