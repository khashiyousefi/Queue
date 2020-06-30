package com.SixLink;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array;
    private int head = 0;
    private int tail = 0;
    public ArrayQueue (int capacity){
        array = new int[capacity];
    }

    public void enqueue(int item){
        if (tail == array.length){
            throw new IllegalStateException();
        }
        array[tail] = item;
        tail++;
    }
    public int dequeue(){
        if (head == tail)
            throw new IllegalStateException();
        int copy =  array[head];
        head++;
        return copy;

    }
    public void peek(){
        System.out.println(array[head]);

    }
    public boolean isEmpty(){
        return (head == tail);

    }
    public boolean isFull(){
        return ((tail - head) % 4 == 0);
    }

    public String print(){
        int[] copy = Arrays.copyOfRange(array, head, tail);
        return Arrays.toString(copy);
    }
}
