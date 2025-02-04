package com.zipcodewilmington.singlylinkedlist;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    public void printLinkedListHelper(SinglyLinkedList.Node currentNode) {

        do {
            currentNode = currentNode.getNext();
            System.out.println(currentNode.data);
        } while (currentNode.getNext() != null);
    }
    @Test
    void setNextNodeTest() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Ludo");
        testList.add("Dumbledore");
        testList.add("Ludo");

        SinglyLinkedList.Node currentNode = testList.head.getNext();

        assertTrue(testList.contains(testList,"Dumbledore"));

        printLinkedListHelper (testList.head);


    }

    @Test
    void removeTestDoesNothingWhenIndexIsAbsent() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Ludo");

        int expected = testList.size;
        testList.remove(1);
        int actual = testList.size;

       assertEquals(expected, actual);

       printLinkedListHelper (testList.head);

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

        printLinkedListHelper (testList.head);

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

        printLinkedListHelper (testList.head);

    }

    @Test
    void containsTestWhenElementIsNotPresent () {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Checkers Index 0");
        testList.add("Monopoly Index 1");
        testList.add("Mancala Index 2");
        testList.add("Uno Index 3");

        boolean actual = testList.contains(testList,"Ludo");


        assertFalse(actual);

        printLinkedListHelper (testList.head);

    }


    @Test
    void containsTestWhenElementIsPresent() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Ludo");
        testList.add("Monopoly Index 1");
        testList.add("Mancala Index 2");
        testList.add("Uno Index 3");

        boolean actual = testList.contains(testList, "Ludo");


        assertTrue(actual);

        printLinkedListHelper (testList.head);

    }

    @Test
    void findReturnsElementIndexIfFoundTest() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Peter");
        testList.add("Piper");
        testList.add("Pickle");

        System.out.println(testList.find(testList,"Peter"));
        System.out.println(testList.find(testList,"Piper"));
        System.out.println(testList.find(testList,"Pickle"));

        int actual = testList.find(testList,"Pickle");
        int expected = 2;

        assertEquals(actual, expected);
        printLinkedListHelper (testList.head);


    }

    @Test
    void findReturnsElementIndexIfNotFoundTest() {
        SinglyLinkedList testList = new SinglyLinkedList();
        testList.add("Peter");
        testList.add("Piper");
        testList.add("Pickle");

        int actual = testList.find(testList,"Cucumber");
        int expected = -1;

        assertEquals(actual, expected);

        printLinkedListHelper (testList.head);


    }



}