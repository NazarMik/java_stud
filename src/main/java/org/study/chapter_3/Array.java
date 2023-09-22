package org.study.chapter_3;


public class Array {
    public static void main(String[] args) {
        int[] month_days;

        month_days = new int[12];

        month_days[0] = 30;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 29;
        month_days[4] = 30;
        month_days[5] = 31;
        month_days[6] = 31;
        month_days[7] = 28;

        System.out.println(" Aprile = " + month_days[3] + " Days");


    }
}
