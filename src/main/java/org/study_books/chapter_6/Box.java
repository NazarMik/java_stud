package org.study_books.chapter_6;

public class Box {
    double width;
    double height;
    double depth;
}
class BoxDemo{
    public static void main(String[] args) {
        Box box = new Box();
        double vol;

        box.depth = 21;
        box.height = 22;
        box.width = 23;

        vol = box.depth * box.height * box.width;
        System.out.println(vol);
    }
}
