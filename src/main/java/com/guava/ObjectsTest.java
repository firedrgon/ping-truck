package com.guava;

import com.google.common.base.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * ObjectsTest
 *
 * @author shenyp
 * @date 2016/11/25
 */
public class ObjectsTest {
    public static void main(String[] args) {
        System.out.println(Objects.equal(null, "1"));
        System.out.println(Objects.equal(null, null));
        System.out.println(Objects.equal("1", "1"));

        System.out.println(new Long(2));

        BigDecimal b = new BigDecimal(Double.toString(225027.7431)).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(b);


        Map<String,Map<String,List<String>>> map = Maps.newHashMap();
        String str = "he";
        String[] strs = {"qw1", "32ree", "5ew"};
        List<String> list = Lists.asList(str, strs);
        List<String> transform = Lists.transform(list, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });

        System.out.println(transform);

        String s = CharMatcher.DIGIT.retainFrom("21121 asdf5555555555adfa 1212");
        System.out.println(s);

        String join = Joiner.on(";").join(strs);
        System.out.println(join);

        int[] ii = {1, 2, 3, 4, 5};
        boolean contains = Ints.contains(ii, 5);
        System.out.println(contains);

//        Properties properties = System.getProperties();
//        System.out.println(properties);
//        List<String> list1 = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(properties.toString());
//        for (String s1 : list1) {
//            System.out.println(s1);
//        }

        String fileName= "D:" + File.separator +"hello.txt";
        String fileName2= "D:" + File.pathSeparatorChar +"hello.txt";
        System.out.println(fileName);
        System.out.println(fileName2);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hello.txt"));
            oos.writeObject(new Person(2,"zhangsan",true));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Person implements Serializable{
    private int id;
    private String name;
    private boolean is;

    public Person(int id, String name, boolean is) {
        this.id = id;
        this.name = name;
        this.is = is;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean is() {
        return is;
    }

    public void setIs(boolean is) {
        this.is = is;
    }
}
