package org.Epam.Abstract_Interface.Interfaces;

public class Addition implements Operation{

    @Override
    public int calculate(int first, int second) {
        return first + second;
    }
}
