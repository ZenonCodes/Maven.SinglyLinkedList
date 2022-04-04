package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

    @Test
    void removeTestDoesNothingWhenIndexIsAbsent() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Ludo");

        int expected = testList.size;
        testList.remove(1);
        int actual = testList.size;

       assertEquals(expected, actual);




        SinglyLinkedList.Node currentNode = testList.head;

        do {currentNode = currentNode.getNext();
            System.out.println(currentNode.data);
        } while(currentNode.getNext() != null);

    }

    @Test
    void removeTestWhenIndexIsPresent() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Ludo Index 0");
        testList.add("Monopoly Index 1");
        testList.add("Mancala Index 2");
        testList.add("Uno Index 3");

        int expected = testList.size;
        testList.remove(1);
        int actual = testList.size;

        assertNotEquals(expected, actual);




        SinglyLinkedList.Node currentNode = testList.head;

        do {currentNode = currentNode.getNext();
            System.out.println(currentNode.data);
        } while(currentNode.getNext() != null);

    }

    @Test
    void removeTestWhenIndexIsPresentBound1() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Ludo Index 0");
        testList.add("Monopoly Index 1");
        testList.add("Mancala Index 2");
        testList.add("Uno Index 3");

        int expected = testList.size;
        testList.remove(0);
        int actual = testList.size;

        assertNotEquals(expected, actual);




        SinglyLinkedList.Node currentNode = testList.head;

        do {currentNode = currentNode.getNext();
            System.out.println(currentNode.data);
        } while(currentNode.getNext() != null);

    }

    @Test
    void removeTestWhenIndexIsPresentBound2() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Ludo Index 0");
        testList.add("Monopoly Index 1");
        testList.add("Mancala Index 2");
        testList.add("Uno Index 3");

        int expected = testList.size;
        testList.remove(testList.size-1);
        int actual = testList.size;

        assertNotEquals(expected, actual);




        SinglyLinkedList.Node currentNode = testList.head;

        do {currentNode = currentNode.getNext();
            System.out.println(currentNode.data);
        } while(currentNode.getNext() != null);

    }



}