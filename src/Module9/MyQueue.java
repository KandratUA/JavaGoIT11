package Module9;

public class MyQueue<T> {
    private T[] array;
    private int front;  // індекс першого елемента у черзі
    private int rear;  // індекс наступного вільного місця у черзі
    private int size;  // розмір черги

    public MyQueue(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void add(T value) {
        if (size == array.length) {
            throw new IllegalStateException("Queue is full");
        }
        array[rear] = value;
        rear = (rear + 1) % array.length;
        size++;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[(front + i) % array.length] = null;
        }
        front = 0;
        rear = 0;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return array[front];
    }

    public T poll() {
        if (size == 0) {
            return null;
        }
        T value = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        return value;
    }
}
