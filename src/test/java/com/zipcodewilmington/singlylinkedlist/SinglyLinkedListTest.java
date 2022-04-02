package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Test;
class SinglyLinkedListTest {

//    @Test
//    void getHeadNode() {
//        SinglyLinkedList testList = new SinglyLinkedList("Monopoly");
//        System.out.println(testList.getHeadNode().data);
//    }

    @Test
    void setNextNode() {
        SinglyLinkedList testList = new SinglyLinkedList("Monopoly");
        testList.add("Ludo");
        SinglyLinkedList.Node currentNode = testList.headNode;

        do {System.out.println(currentNode.data);
            currentNode =  currentNode.getNextNode();
            System.out.println(currentNode.data);
        } while(currentNode.getNextNode() != null);

    }

    @Test
    void getTail() {
    }

    @Test
    void setTail() {
    }
}