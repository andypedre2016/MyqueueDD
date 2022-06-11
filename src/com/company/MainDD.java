package com.company;

public class MainDD {
    public static void main(String[] args) throws EmptyQueueException, FullQueueException {

        MyQueueDD queue = new MyQueueDD(5);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(4);
        //queue.enQueue(3);
        //queue.deQueue();
        //System.out.println(queue.deQueue());

        while (!queue.isEmpty()){
            System.out.println(queue.deQueue());
        }
    }
}


