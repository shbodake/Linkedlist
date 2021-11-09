package com.blp.linkedlist;

public class Operation {

    public static void addDataAtStart(){
        Linklist1 linkedList = new Linklist1();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    public static void addDataAtEnd() {
        Linklist1 linkedList = new Linklist1();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    public void addDataAtMiddle() {
        Linklist1 linkedList = new Linklist1();
        Node secondNode =  linkedList.push(70);
        Node firstNode =  linkedList.push(56);
        Node newNode = new Node(30);
        linkedList.print();
        System.out.println("");
        linkedList.insertInBetween(firstNode, newNode);
        linkedList.print();
    }
    public void deleteFirstNode() {
        Linklist1 linkedList = new Linklist1();
        addDataAtStart();
        System.out.println("");
        Node deleteNode = linkedList.pop();
        linkedList.print();
    }
    public void deleteLastNode() {
        Linklist1 linkedList = new Linklist1();
        addDataAtStart();
        System.out.println("");
        linkedList.popLast();
        linkedList.print();
    }
    public void findNodeBasedOnValue() {
        Linklist1 linkedList = new Linklist1();
        addDataAtStart();
        linkedList.findNode(30);
    }
}
