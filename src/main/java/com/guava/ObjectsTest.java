package com.guava;

import com.google.common.base.Objects;

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
    }
}
