package com.company;

public class EmptyQueueException extends Exception {
    public EmptyQueueException(String queue_is_empty) {
        super(queue_is_empty);
    }
}
