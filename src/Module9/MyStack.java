package Module9;

import java.util.NoSuchElementException;

public class MyStack {
    Object[] elements;
    private int size;

    public MyStack() {
        elements = new Object[10];
        size = 0;
    }

    public void push(Object value) {
        if (size >= elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = value;
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object removedElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return removedElement;
    }

    public void clear() {
        elements = new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return elements[size - 1];
    }

    public Object pop() {
        Object element = peek();
        elements[size - 1] = null;
        size--;
        return element;
    }
}