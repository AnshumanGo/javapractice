package com.practice.java._22javaio;

import java.io.*;

public class _4JavaSerializationAndDeserialization implements Serializable {

    int id;
    transient String name; //this field will not be serialized

    public _4JavaSerializationAndDeserialization(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        _4JavaSerializationAndDeserialization javaSerializationAndDeserializationOne =new _4JavaSerializationAndDeserialization(211,"ravi");

        FileOutputStream fileOutputStream=new FileOutputStream("fileJavaSerializationAndDeserialization.txt");

        //serialization
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(javaSerializationAndDeserializationOne);
        objectOutputStream.flush();

        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("success");

        //deserialization
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("fileJavaSerializationAndDeserialization.txt"));
        _4JavaSerializationAndDeserialization javaSerializationAndDeserializationTwo=(_4JavaSerializationAndDeserialization)objectInputStream.readObject();
        System.out.println(javaSerializationAndDeserializationTwo.id+" "+javaSerializationAndDeserializationTwo.name);
        objectInputStream.close();
    }
}
