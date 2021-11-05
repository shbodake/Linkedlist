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
}
