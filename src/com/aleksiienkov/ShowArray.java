package com.aleksiienkov;

public class ShowArray extends ArrayPrinter {
    @Override
    protected void printElem(int a) {
        System.out.print("{"+a+"}");

    }
}
