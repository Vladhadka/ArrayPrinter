package com.aleksiienkov;

public class SuperPrint extends ArrayPrinter {
    @Override
    protected void printElem(int a) {
        System.out.println(">>"+a+"<<");
    }
}
