package com.guava;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * Created by Administrator on 2016/11/10.
 */
public class GuavaFiles {
    public static void main(String[] args) {
        String join = Joiner.on(",").join(Lists.newArrayList(3));
        System.out.println(join);
    }
}
