package com.SixLink;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
        System.out.println(queue.printToArray());
        int removed = queue.dequeue();
        System.out.println(removed);
        System.out.println(queue.printToArray());
        queue.enqueue(10);
        System.out.println(queue.isEmpty());
        queue.dequeue();
        System.out.println(queue.peek());
//        int removed2 = queue.dequeue();
//        System.out.println(removed2);
//        System.out.println(queue.printToArray());
//        int removed3 = queue.dequeue();
//        System.out.println(removed3);
//        System.out.println(queue.printToArray());


    }
}
