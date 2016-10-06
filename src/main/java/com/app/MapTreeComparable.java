package com.app;

import java.util.Map;
import java.util.TreeMap;

/**
 * class to implement TreeMap and sort the Student Object based on Age.
 */
public class MapTreeComparable {

    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<Student, Integer>();

        Student s1 = new Student(26,"mayank");
        Student s2 = new Student(20,"ankit");
        Student s3 = new Student(30,"prateek");
        Student s4 = new Student(18,"harshit");

        map.put(s1, 1);
        map.put(s2, 2);
        map.put(s3, 3);
        map.put(s4, 4);

        for(Map.Entry m : map.entrySet()){
            Student key = (Student)m.getKey();
            int age = key.age;
            String name = key.name;
            System.out.println(age+" "+name+" "+m.getValue());
        }
    }
}


