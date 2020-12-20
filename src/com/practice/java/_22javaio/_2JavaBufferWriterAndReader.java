package com.practice.java._22javaio;

import java.io.*;

public class _2JavaBufferWriterAndReader {

    /*
    Java BufferedWriter class is used to provide buffering for Writer instances.
    It makes the performance fast. It inherits Writer class. The buffering
    characters are used for providing the efficient writing of single arrays,
    characters, and strings. Java BufferedWriter extends Writer.

    Java BufferedReader class is used to read the text from a character-based
    input stream. It can be used to read data line by line by readLine() method.
    It makes the performance fast. Java BufferedReader extends Reader.
    */

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
