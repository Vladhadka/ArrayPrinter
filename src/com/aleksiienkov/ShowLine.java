package com.aleksiienkov;

public class ShowLine extends ArrayPrinter {
    @Override
    protected void printElem(int a) {
        System.out.println("-------");
        System.out.println(a);
        System.out.println("-------");

    }
}
