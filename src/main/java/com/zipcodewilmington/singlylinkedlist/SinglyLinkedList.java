package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    public Node head;
    public Node tail;
    public static int size = 0;

    public SinglyLinkedList(){
        head = new Node(null);
        tail = head;
        size = 0;
    }

    // add -- add an element to the list

    public void add(T element) {
        size++;
        tail.setNext(new Node (element));
        tail = tail.getNext();
    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) return;
        Node currentNode = head.getNext();
        Node prevNode = head;

        for (int i = 0; i != index; i++){
            currentNode = currentNode.getNext();
            prevNode = prevNode.getNext();
        }
        prevNode.setNext(currentNode.getNext());
        size--;
    }

    public boolean contains(SinglyLinkedList searchMe, T element) {
        SinglyLinkedList.Node currentNode = searchMe.head;
        do {
            currentNode = currentNode.getNext();
            if (currentNode.data.equals(element)) return true;

        } while(currentNode.getNext() != null);

       return (searchMe.tail.data.equals(element));
    }

    public int find(SinglyLinkedList searchMe, T element) {
        SinglyLinkedList.Node currentNode = searchMe.head;
        int index = 0;
        do {
            currentNode = currentNode.getNext();
            if(currentNode.data.equals(element)) return index;
        } while(currentNode.getNext() != null);
        if (currentNode.data.equals(element)) return (++index);

        return -1;
    }

    public static class Node<T> {
        public T data;
//        private Node prev;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public void setNext(Node node) {
            this.next = node;
        }

        public Node getNext() {
            return this.next;
        }

    }



}