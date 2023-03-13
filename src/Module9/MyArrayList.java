package Module9;

public class MyArrayList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[10];
        this.size = 0;
    }

    public void add(T value) {
        if (this.size == this.data.length) {
            Object[] newData = new Object[this.data.length * 2];
            System.arraycopy(this.data, 0, newData, 0, this.size);
            this.data = newData;
        }
        this.data[this.size++] = value;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        return (T) this.data[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        T value = (T) this.data[index];
        System.arraycopy(this.data, index + 1, this.data, index, this.size - index - 1);
        this.data[--this.size] = null;
        return value;
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.data[i] = null;
        }
        this.size = 0;
    }

    public int size() {
        return this.size;
    }
}
