package com.guava;

import static com.google.common.base.Preconditions.checkState;
import static com.google.common.base.Preconditions.checkPositionIndexes;
import static com.google.common.base.Preconditions.checkPositionIndex;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * PreconditionTest
 *
 * @author shenyp
 * @date 2016/12/9
 */
public class PreconditionTest {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7);
        checkPositionIndex(0, 6, "hello");
        checkPositionIndexes(0, 6, list.size());
        checkState(list.contains(2),"list为空！");
        System.out.println(Optional.of(1).of(2).of(3).asSet().size());

    }
}
