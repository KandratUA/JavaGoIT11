package Module9;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private Node<T> front; // вказівник на передній елемент черги
    private Node<T> rear; // вказівник на останній елемент черги
    private int size; // розмір черги

    // внутрішній клас для зберігання елементів черги
    private static class Node<T> {
        private T data; // дані елементу
        private Node<T> next; // вказівник на наступний елемент

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // додати елемент в кінець черги
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    // очистити чергу
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    // отримати розмір черги
    public int size() {
        return size;
    }

    // отримати перший елемент черги
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.data;
    }

    // отримати перший елемент черги і видалити його з черги
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

    // перевірити, чи черга порожня
    public boolean isEmpty() {
        return size == 0;
    }
}
