package org.Epam.Strings;

public class String_1 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abcdddddddd");

        System.out.println(s1 == s2.intern());
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }

}
