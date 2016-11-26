package com.ping;

import java.math.BigDecimal;

/**
 * PersonTest
 *
 * @author shenyp
 * @date 2016/11/23
 */
public class PersonTest {

    public static class Test{
        public Test() {
            System.out.println("test");
        }
    }
    public static void main(String[] args) {
        Person person = new Person(){
            public void eat() {
                System.out.println("ddd");
            }
        };

        person.eat();

        Person p = () ->{
            System.out.println("eat");
        };
        p.eat();

        BigDecimal bigDecimal = new BigDecimal("0.1");
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(0.1));
        System.out.println(bigDecimal);
        System.out.println(bigDecimal2);
        System.out.println(BigDecimal.valueOf(0.1));

    }
}

interface Person{
    void eat();
}

class Sington{
    public static volatile Sington sington = null;

    private Sington() {

    }

    private synchronized Sington getInstance() {
        if (sington == null) {
            synchronized (Sington.class) {
                sington = new Sington();
            }
        }
        return sington;
    }

}

abstract class ab{
    public int a = 0;
    public abstract void test();
}

interface ac{
    int b = 0;
}

