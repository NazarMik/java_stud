package org.Epam.Abstract_Interface.Interfaces;
@FunctionalInterface
public interface Operation {
    int calculate(int first, int second);

    static void printOperation(Operation op, int a, int b){
        System.out.println(op.calculate(a,b));
    }
}
