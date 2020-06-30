package com.SixLink;

import java.util.Stack;

public class QueueWithStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> printStack = new Stack<>();
    public int dequeue(){
        moveStackContent();
        return printStack.pop();

    }

    private void moveStackContent() {
        if (printStack.isEmpty()) {
            if (stack.isEmpty())
                throw new IllegalStateException();
            while (!stack.isEmpty()) {
                printStack.push(stack.pop());
            }
        }
    }

    public void enqueue(int item){
        stack.push(item);
    }

    public boolean isEmpty(){
        return (printStack.isEmpty() && stack.isEmpty());
    }
    public int peek(){
        moveStackContent();
        return printStack.peek();

    }

    public void print(){
//        int [] array = new int[stack.size()+printStack.size()];
//        for (int i = 0; i < stack.size()+printStack.size(); i++){
//            array[i]
//        }
        System.out.println(printStack.toString() + stack.toString());

    }
}
