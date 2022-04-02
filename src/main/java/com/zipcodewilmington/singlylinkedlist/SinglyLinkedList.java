package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Object>  {

    protected static int size = 1;
    public Node node;
    public Node headNode;
    static int index;





    /** add -- add an element to the list
     remove -- remove an element (specified by numeric index) from the list
     contains -- returns true if the element is in the list, false otherwise
     find -- returns the element's index if it is in the list, -1 otherwise
     size -- returns the current size of the list
     get -- returns the element at the specified index
     copy -- returns a new linked list containing the same values
     sort -- sorts the list using your algorithm of choice.
     */
    public void add(T element){

       node.setNext(new Node(element));
    }
    public void remove(int index){
        if(index > this.index || index < this.index) return;
        Node currNode = headNode;
        Node prevNode = null;

        while (currNode.index != index) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
        if (currNode.index != size - 1){
        prevNode.setNext(currNode.getNext());
        } else  prevNode.setNext(null);

    }

    public void contains(T node){}
    public void find(T node){}
    public void size(){}
    public void get(T node){}
    public void copy(T node){ }
    public void sort(){}

    public class Node {
        T data;
        int index;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.index = SinglyLinkedList.index;
            SinglyLinkedList.index++;

        }

        public void setNext(Node node) {
            this.next = node;
            size++;
        }

        public Node getNext() {
            return this.next;
        }

    }

    public static int getSize() {
        return size;
    }

    public SinglyLinkedList (T data) {
        headNode =  new Node(data);
        size++;
    }


    public Node getHeadNode() {
        return headNode;
    }

}
