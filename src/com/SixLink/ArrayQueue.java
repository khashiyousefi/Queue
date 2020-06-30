package com.SixLink;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array;
    private int head = 0;
    private int tail = 0;
    private int count = 0;
    public ArrayQueue (int capacity){
        array = new int[capacity];
    }

    public void enqueue(int item){
        if (count == array.length){
            throw new IllegalStateException();
        }
        array[tail] = item;
        tail = (tail +1) % array.length;
        count++;
    }
    public int dequeue(){
        if (count == 0){
            throw new IllegalStateException();
        }
        int copy =  array[head];
        head = (head + 1) % array.length;
        count--;
        return copy;

    }
    public void peek(){
        System.out.println(array[head]);

    }
    public boolean isEmpty(){
        return (count ==0);

    }
    public boolean isFull(){
        return (count == array.length);
    }

    public String print(){
        int[] copyArray = new int[array.length];
        int headToTail = head;
        if (head == tail) return Arrays.toString(array);
        for (int i = 0; headToTail != tail;i++){
            copyArray[i] = array[headToTail];
            headToTail = (headToTail + 1) % array.length;
        }
        return Arrays.toString(copyArray);
//        int[] copy = Arrays.copyOfRange(array, head, tail);
//        return Arrays.toString(copy);
    }
}
