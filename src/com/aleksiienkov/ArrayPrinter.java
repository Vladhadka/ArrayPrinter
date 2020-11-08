package com.aleksiienkov;

import java.lang.reflect.Array;
import java.util.Arrays;

public  abstract class ArrayPrinter {
    protected abstract void printElem(int a);

    public void print (int[] array){

        for (int i = 0; i < array.length*2; i++) {

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1) ;
            printElem(array[i]);
        }
        for (int i = 0; i < array.length*2; i++) {

        }
        System.out.println();
    }
}