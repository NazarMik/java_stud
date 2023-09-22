package org.study_books.chapter_3;

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;

        System.out.print("За " + days);
        System.out.print(" днів світло пройде близько ");
        System.out.println(distance + " миль.");
    }
}
