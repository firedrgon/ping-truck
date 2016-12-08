package com.ping;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * SetTest
 *
 * @author shenyp
 * @date 2016/11/26
 */
public class SetTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("hello");
        set.add("hello");

        System.out.println(set.size());
        System.out.println("hello".hashCode());
        System.out.println("hello".hashCode());

        TreeSet treeSet = new TreeSet();
        treeSet.add(new Student("hellp"));
        treeSet.add(new Student("hellp"));
        System.out.println(treeSet.size());
    }
}
class Student implements Comparable<Student>{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
