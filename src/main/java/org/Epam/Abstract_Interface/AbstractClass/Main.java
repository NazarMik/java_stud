package org.Epam.Abstract_Interface.AbstractClass;

public class Main {
    public static void main(String[] args) {

        Operation o1 = new Addition();
        System.out.println(o1.calculate(5,3));

        o1 = new Substraction();
        System.out.println(o1.calculate(5,3));
    }
}
