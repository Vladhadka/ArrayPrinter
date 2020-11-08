package com.aleksiienkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7};
        int arr2[]={8,9,10,11,22};
        int arr3[]={44,55,66,77,88,99};
        ArrayPrinter arrayPrinter;
        int choice;
        while (true) {
            System.out.println("Choose your type of print:");
            System.out.println("1. Show every element by new line");
            System.out.println("2. Print element in the {} scopes");
            System.out.println("3. Print like >>elements<<");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    arrayPrinter = new ShowLine(); break;
                case 2:
                    arrayPrinter= new ShowArray();break;
                case 3:
                    arrayPrinter= new SuperPrint();break;


                default:
                    arrayPrinter = new ShowDefault();
                    break;
            }
            arrayPrinter.print(arr);
            System.out.println("NEXT ARRAY");
            arrayPrinter.print(arr2);
            System.out.println("NEXT ARRAY");
            arrayPrinter.print(arr3);
            System.out.println("OVER");
            System.out.println("Do you want to try adain?"+"\n"
                    +"yes - 1"+"\n"
                    +"no - another");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice != 1) break;
        }








    }}

