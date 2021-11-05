package com.blp.linkedlist;
import java.util.Scanner;
public class Linkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        switch(scanner.nextInt()) {
            case 1:
                Operation.addDataAtStart();
                scanner.close();
            case 2:
                Operation.addDataAtEnd();
                break;
        }
        scanner.close();
    }

    }

