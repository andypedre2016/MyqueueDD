package com.company;

import java.util.LinkedList;

public class MyQueueDD {

    private int maxSize;
    private LinkedList<Integer> queue;

    public MyQueueDD(int size) {
        maxSize = size;
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public boolean isFull() {
        return (queue.size() == maxSize);
    }

    public int size() {
        return queue.size();
    }

    public void enQueue(Integer obj) throws FullQueueException {
        try {
            if (!isFull()) {
                queue.addLast(obj);
            } else
                throw new FullQueueException("Queue is full");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Integer deQueue() throws EmptyQueueException {
        try {
            if (!isEmpty()) {
                Integer myInt = queue.removeFirst();
                return myInt;
            } else
                throw new EmptyQueueException("Queue is empty");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}