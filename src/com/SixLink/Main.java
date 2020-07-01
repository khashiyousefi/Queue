package com.SixLink;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue(5);
//        queue.insert(1);
//        queue.print();
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        queue.print();
        System.out.println(queue.delete());
        queue.print();
        System.out.println(queue.delete());
        queue.print();
        System.out.println(queue.delete());
        queue.print();
        queue.insert(10);
        queue.print();
        queue.insert(5);
        queue.print();



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

    public static void arrayReverse(Queue<Integer> queue){
        while(!queue.isEmpty()){

        }
    }
}
