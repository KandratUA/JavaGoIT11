package Module9;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;


    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }


    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
        size++;
    }


    public void clear() {
        while (!isEmpty()) {
            poll();
        }
    }


    public int size() {
        return size;
    }


    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.data;
    }


    public T poll() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }


    public boolean isEmpty() {
        return size == 0;
    }
}
