package com.practice.java._21javacollections;

import java.util.ArrayList;
import java.util.Collections;

public class _12JavaComparable {

    /*

    */

    static class Student implements Comparable<Student> {

        private int id;
        private String name;

        Student(int rollno,String name){
            this.id=rollno;
            this.name=name;
        }

        @Override
        public int compareTo(Student o) {

            if(id==o.id)
                return 0;
            else if(id>o.id)
                return 1;
            else
                return -1;
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(1,"Mango"));
        al.add(new Student(3,"Orange"));
        al.add(new Student(2,"Muskmelon"));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.id+" "+st.name);
        }
    }

}

