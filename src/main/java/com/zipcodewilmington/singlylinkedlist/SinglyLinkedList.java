package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    public Node headNode;
    public Node tail;


    public SinglyLinkedList(T element) {
        this.headNode = new Node(element);
        tail = headNode;
    }


    // add -- add an element to the list

    public void add(T element) {
        tail.setNextNode(new Node(element));
        tail = tail.next;
    }

    public static class Node<T> {

        public T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public void setNextNode(Node node) {
            this.next = node;
        }

        public Node getNextNode() {
            return this.next;
        }

    }



}