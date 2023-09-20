package org.study.chapter_3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 321.234;

        System.out.println("int in byte: ");
        b = (byte) i;
        System.out.println("i i b " + i + " " + b);

        System.out.println("double in int: ");
        i = (int)d;
        System.out.println("d i i = "+ d + " " + i);

        System.out.println("double in byte: ");

        b = (byte) d;
        System.out.println("d i b = " + d + " " + b);
    }
}
