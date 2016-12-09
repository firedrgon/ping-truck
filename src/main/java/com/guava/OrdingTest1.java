package com.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.Collections;
import java.util.List;

/**
 * OrdingTest1
 *
 * @author shenyp
 * @date 2016/12/9
 */
public class OrdingTest1 {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList(
                "Dawson", "Gatski", "Langer", "Hein",
                "Frankie Baggadonuts", "Turner", "Trafton",
                "Stephenson", "Ringo", "Otto", "Webster");

        Ordering ordering = Ordering.natural();
        String min = ordering.from(String.CASE_INSENSITIVE_ORDER).min(list);
        System.out.println(min);

        System.out.println("================================================");

        List<String> famousBridges = Lists.newArrayList(
                "Great Belt Bridge",
                "Chapel Bridge",
                "Chengyang Bridge",
                "null",
                "Brooklyn Bridge",
                "Ponte Vecchio"
        );

        Ordering<String> ordering1 = new Ordering<String>() {
            @Override
            public int compare(String s, String t1) {
                return Ints.compare(s.length(), t1.length());
            }
        };

        Collections.sort(famousBridges,ordering1.nullsFirst());
        System.out.println(famousBridges);

        System.out.println("===========================================");

        List<Integer> startingLineUp = Lists.newArrayList(
                73, 58, 66, 57, 32, 88, 90, 12, 15, 99, 11
        );

        List<Integer> integers = Ordering.natural().leastOf(startingLineUp, startingLineUp.size());
        System.out.println(integers);


    }
}




































