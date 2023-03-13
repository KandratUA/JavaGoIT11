package Module9;

import java.util.NoSuchElementException;

public class MyStack {
    private Node top; // початок стеку
    private int size; // розмір стеку

    private static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    // додавання елементу в кінець стеку
    public void push(Object value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    // видалення елементу зі стеку за індексом
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            top = top.next;
        } else {
            Node previous = getNode(index - 1);
            Node current = previous.next;
            previous.next = current.next;
        }
        size--;
    }

    // очищення стеку
    public void clear() {
        top = null;
        size = 0;
    }

    // повертає розмір стеку
    public int size() {
        return size;
    }

    // повертає перший елемент стеку
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    // повертає перший елемент стеку та видаляє його
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // допоміжний метод, який повертає ноду за індексом
    private Node getNode(int index) {
        Node current = top;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}

