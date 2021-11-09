package com.blp.linkedlist;
import java.util.Scanner;
public class Linkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation operation = new Operation();
        System.out.println("Enter 1 to add the data at the start\\n\" + \"Enter 2 to add the data at the end\\n\" +\n" +"\"Enter 3 to add the data at middle" + "Enter 4 to delete the first element\n" +
                "Enter 5 to delete the last element\n" + "Enter 6 to find index number and node based on value");
        switch(scanner.nextInt()) {
            case 1:
                Operation.addDataAtStart();
                scanner.close();
            case 2:
                Operation.addDataAtEnd();
                break;
            case 3:
                operation.addDataAtMiddle();
                break;
            case 4:
                operation.deleteFirstNode();
                break;
            case 5:
                operation.deleteLastNode();
                break;
            case 6:
                operation.findNodeBasedOnValue();
                break;
        }
        scanner.close();
    }

    }

