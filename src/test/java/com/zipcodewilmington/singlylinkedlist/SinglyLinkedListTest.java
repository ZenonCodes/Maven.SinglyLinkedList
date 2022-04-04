package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinglyLinkedListTest {

//    @Test
//    void getHeadNode() {
//        SinglyLinkedList testList = new SinglyLinkedList("Monopoly");
//        System.out.println(testList.getHeadNode().data);
//    }

    @Test
    void setNextNode() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Ludo");
        testList.add("Ludo");
        testList.add("Ludo");

        SinglyLinkedList.Node currentNode = testList.head.getNext();

        do {System.out.println(currentNode.data);
            currentNode =  currentNode.getNext();
            System.out.println(currentNode.data);
        } while(currentNode.getNext() != null);

    }

//    @Test
//    void removeTest() {
//        SinglyLinkedList testList = new SinglyLinkedList();
//        testList.add("Ludo");
//        testList.remove(1);
//
//        SinglyLinkedList.Node expected = testList.head;
//        SinglyLinkedList.Node actual = testList.tail;
//
//       assertEquals(expected, actual);
//
//
//
//
//        SinglyLinkedList.Node currentNode = testList.head;
//
//


//        do {System.out.println(currentNode.data);
//            currentNode =  currentNode.getNext();
//            System.out.println(currentNode.data);
//        } while(currentNode.getNext() != null);

//    }




}