package org.Epam.Strings;

import org.w3c.dom.ls.LSOutput;

public class String_1 {
    public static void main(String[] args) {

        System.out.println("dvамипv");
        String s1 = "abcd";
        String s2 = new String("abdпкd");

        System.out.println(s1 == s2.intern());
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));

        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb.length() + " " + sb.capacity());

        String s3 = "123";
        String s4 = s3;
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s3));
    }
}
