package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    public Node headNode;
    public Node tail;
    public static int size = 1;

    public SinglyLinkedList(){
        headNode = new Node(null);
        tail = headNode;

    }
    public SinglyLinkedList(T element) {
        this.headNode = new Node(element);
        tail = headNode;
    }


    // add -- add an element to the list

    public void add(T element) {
        size++;
        tail.setNextNode(new Node(element));
        tail = tail.next;

    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) return;

        if(headNode.index == index){
            headNode = headNode.next;
            return;
        }

        Node currentNode = headNode;
        Node prevNode = headNode;
        SinglyLinkedList newList = new SinglyLinkedList();

        for (int i = 0; i < size; i++){
            if(currentNode.index != index){
                newList.tail.setNextNode((currentNode));
                currentNode = currentNode.getNextNode();
            } else {
                prevNode.next = currentNode.getNextNode();}
        }
    }

    public static class Node<T> {

        public T data;
        int index;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.index = size - 1;
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