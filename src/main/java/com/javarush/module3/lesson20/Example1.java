package com.javarush.module3.lesson20;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.text.StringEscapeUtils;

public class Example1 {
    public static void main(String[] args) {
        StringUtils.join();
        String.join("");


        String s = org.apache.commons.lang3.StringEscapeUtils.escapeHtml3("<script>Україна ä</script>");
        System.out.println(s);

        System.out.println(StringEscapeUtils.escapeHtml4("<script>Україна ä</script>"));

//        ExceptionUtils.getMessage()
    }
}
