package org.study.chapter_4;

public class Average {
    public static void main(String[] args) {
        double[] num = {10.2, 10.2,10.5,15.5, 10,6};
        double result = 0; int i;

        for (i = 0; i<5; i++) {
            result = result + num[i];
            System.out.println("Middle point " + result / 5);
        }
    }
}
