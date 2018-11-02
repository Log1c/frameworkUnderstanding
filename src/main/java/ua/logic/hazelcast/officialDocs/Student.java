package ua.logic.hazelcast.officialDocs;

import java.io.*;

public class Student implements Serializable, Comparable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student)) {
            throw new IllegalArgumentException();
        }

        return getName().compareTo(((Student)o).getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
