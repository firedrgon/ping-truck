package com.guava;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

/**
 * ObjectsTest1
 *
 * @author shenyp
 * @date 2016/12/9
 */
public class ObjectsTestTest {
    public static void main(String[] args) {
        Student student1 = new Student(22, "zhangsan");
        Student student2 = new Student(22, "zhangsan");
        Student student3 = new Student(25, "wangwu");
        Student student4 = new Student(11, "lili");
        Student student5 = new Student(51, "xiaoping");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());

        boolean equals = student1.equals(student2);
        System.out.println(equals);

        int i = student1.compareTo(student2);
        System.out.println(i);

        System.out.println(student1.toString());
        System.out.println("======================");
        Student student = MoreObjects.firstNonNull(student2, student1);
        System.out.println(student);
    }
}

class Student implements Comparable{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age,name);
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return Objects.equal(this.age,student.age) && Objects.equal(this.name,student.name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("age",age).addValue(name).toString();
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student)o;
        return ComparisonChain.start().compare(age,student.age).compare(name,student.name).result();
    }
}

