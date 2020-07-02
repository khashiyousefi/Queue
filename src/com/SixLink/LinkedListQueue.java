package com.SixLink;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListQueue {

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;
    public void enqueue(int item){
        Node node = new Node(item);
        if (first == null){
            first = last = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }
    public int dequeue(){
        int copy = first.value;
        if (first == null)
            throw new IllegalStateException();
        if (first == last){
            last = first = null;
            size--;
            return copy;
        }
        Node next = first.next;
        first.next = null;
        first = next;
        size--;
        return copy;

    }
    public int peek(){
        if (first == null)
            throw new IllegalStateException();
        return first.value;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public int size(){
        return size;
    }
    public String printToArray(){
        int[] array = new int[size];
        Node current = first;
        int i = 0;
        while(current != null){
            array[i] = current.value;
            i++;
            current = current.next;
        }
        return (Arrays.toString(array));
    }
}
