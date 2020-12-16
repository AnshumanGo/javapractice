package com.practice.java._18javagenerics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _1JavaGenerics {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(4, "b");
        map.put(2, "c");

//Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry e = itr.next();//no need to typecast
            System.out.println(e.getKey() + " " + e.getValue());
        }


        GenericClass<Integer> genericClass=new GenericClass<Integer>();
        genericClass.add(2);
        //m.add("b");//Compile time error
        System.out.println(genericClass.get());
    }
}

class GenericClass<T>{
    T obj;
    void add(T obj){this.obj=obj;}
    T get(){return obj;}
}