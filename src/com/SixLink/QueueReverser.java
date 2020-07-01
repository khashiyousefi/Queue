package com.SixLink;

import java.util.Arrays;
import java.util.Objects;
import java.util.Queue;

public class QueueReverser {
    private  Queue<Integer> queue;
    private Object[] arrayQueue;
    int k;
    public QueueReverser (Queue<Integer> queue, int k){
        this.queue = queue;
        this.k = k;
    }
    public Object[] reverser(){
        Object[] arrayQueue =  queue.toArray();
        for (int i =0; i < k; i++){
            if (k == i){
                this.arrayQueue = arrayQueue;
                return arrayQueue;
//                return arrayQueue.getClass().getName() + Integer.toHexString()  //Integer.toHexString(hashCode());
                //getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
            var copy = arrayQueue[k-1];
            arrayQueue[k-1] = arrayQueue[i];
            arrayQueue[i] = copy;
            k--;
        }
        this.arrayQueue = arrayQueue;
        return arrayQueue;
    }
    public void printReverse(){
//        return arrayQueue.getClass().getName() + "@" + Integer.toHexString(hashCode());
        int[] array = new int[queue.size()];
//        var result = arrayQueue.hashCode();
        for (int i = 0; i < arrayQueue.length; i++){
            System.out.println("objects[" + i + "] = " + arrayQueue[i]);
        }
//            array[i] = arrayQueue.hashCode();
//        }
//        return Arrays.toString(array);
//        var result = Objects.toString(queue);
//        return result;
    }
}
