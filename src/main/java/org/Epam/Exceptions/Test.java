package org.Epam.Exceptions;

public class Test {
    public static void main(String[] args) throws Exception {
        boolean flag = true;
        try{
            if (flag) {
                throw new Exception("some Error");
            }
            System.out.println("Other work");
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
