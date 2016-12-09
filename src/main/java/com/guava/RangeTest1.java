package com.guava;

import com.google.common.base.Throwables;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

/**
 * RangeTest1
 *
 * @author shenyp
 * @date 2016/12/9
 */
public class RangeTest1 {
    public static void main(String[] args) {
        Range<Integer> closed = Range.closed(1, 4);
        System.out.println(closed);
        System.out.println(closed.contains(3));

        RangeMap<Integer, String> gradeScale = TreeRangeMap.create();
        gradeScale.put(Range.closed(0, 60), "F");
        gradeScale.put(Range.closed(61, 70), "D");
        gradeScale.put(Range.closed(71, 80), "C");
        gradeScale.put(Range.closed(81, 90), "B");
        gradeScale.put(Range.closed(91, 100), "A");

        String grade = gradeScale.get(77);
        System.out.println(grade);

        String helllo = Throwables.getStackTraceAsString(new Exception("helllo"));
        System.out.println(helllo);
    }
}
