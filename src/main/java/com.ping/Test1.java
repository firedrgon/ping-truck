package com.ping;

import com.google.common.base.Splitter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Test1
 *
 * @author shenyp
 * @date 2016/12/5
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        LocalDate time = LocalDate.parse("2016-10-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String format = time.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);
        System.out.println(time);

        File file = new File("c:" + File.pathSeparatorChar + "text.txt");
        file.createNewFile();

        List<String> codesList = Splitter.on(",").splitToList("dddd");
        System.out.println(codesList);
    }
}
