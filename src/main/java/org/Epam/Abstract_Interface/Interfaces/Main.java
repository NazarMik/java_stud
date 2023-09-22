package org.Epam.Abstract_Interface.Interfaces;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        Operation operation = new Addition();
        Operation.printOperation(operation,a,b);
    }
}
