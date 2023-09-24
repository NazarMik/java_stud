package org.Epam.Strings;

public class String_1 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String(s1);

        System.out.println(s1 ==s2);

        s1 = s1 + "123";
        s1 = s1 + null;
        System.out.println("s1 = "  + s1);
    }
}
