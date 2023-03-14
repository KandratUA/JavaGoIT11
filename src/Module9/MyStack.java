package Module9;

import java.util.NoSuchElementException;


public class MyStack<T> {
    private T[] stack;
    private int top;

    public MyStack(int capacity) {
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T value) {
        if (top == stack.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = value;
    }

    public void remove(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < top; i++) {
            stack[i] = stack[i + 1];
        }
        stack[top--] = null;
    }

    public void clear() {
        stack = (T[]) new Object[10];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public T peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }
}