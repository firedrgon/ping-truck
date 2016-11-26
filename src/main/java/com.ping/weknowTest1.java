package com.ping;

/**
 * weknowTest1
 *
 * @author shenyp
 * @date 2016/11/23
 */
public class weknowTest1 extends Const{
    public final static int NUM = 10000000;
    public static void main(String[] args) {
        long result = NUM * 100 * 20;
        System.out.println(result);
        System.out.println(Const.NUM);
        System.out.println(weknowTest1.NUM);

        int capacity = 10;
        System.out.println(capacity >> 1);

        System.out.println(Integer.parseInt("30") < Integer.parseInt("20"));

        Integer a = 1000,b = 1000;
        Integer c = 100,d = 100;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}

class Const{
    public static final int NUM = 123;
    public final void test(){
        System.out.println("test");
    }
}