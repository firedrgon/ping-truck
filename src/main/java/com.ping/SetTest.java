package com.ping;

import java.util.HashSet;

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
    }
}
