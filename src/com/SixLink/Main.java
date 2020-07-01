package com.SixLink;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        QueueReverser queueReverser = new QueueReverser(queue, 4);
        var reversed = queueReverser.reverser();
//        reversed.toString();
        queueReverser.printReverse();
//        System.out.println(queueReverser.print());
//        System.out.println();
//        System.out.println(getClass().getName()+"@" + Integer.toHexString(hashCode(reversed)));
//        reversed.toString()
//        var result = reversed.toString();
//        queueReverser.print();
//        System.out.println();


    }
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.empty()){
            queue.add(stack.pop());
        }
    }

//    public static void arrayReverse(Queue<Integer> queue){
//        while(!queue.isEmpty()){
//
//        }
//
//    }
}
