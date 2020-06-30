package com.SixLink;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.remove();
//        reverse(queue);
//        System.out.println(queue);

        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
//        System.out.println(queue.print());
        queue.enqueue(50);
        System.out.println(queue.print());
        queue.enqueue(60);
        System.out.println(queue.print());
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(70);
        queue.enqueue(80);
        queue.dequeue();
        System.out.println(queue.print());
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.print());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.print());




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
