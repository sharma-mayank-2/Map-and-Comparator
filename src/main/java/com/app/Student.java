package com.app;

/**
 * Student class with name and age.
 */
public class Student implements Comparable<Student>{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1;
        }
        else if(this.age == o.age){
            return 0;
        }
        else {
            return -1;
        }
    }
}
