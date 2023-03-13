package Module9;

public class MyHashMap {

    private final int DEFAULT_CAPACITY = 16;
    private Node[] array;
    private int size;

    public MyHashMap() {
        array = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyHashMap(int capacity) {
        array = new Node[capacity];
        size = 0;
    }

    public void put(Object key, Object value) {
        int index = getIndex(key);
        Node head = array[index];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Node node = new Node(key, value);
        node.next = array[index];
        array[index] = node;
        size++;
    }

    public Object get(Object key) {
        int index = getIndex(key);
        Node head = array[index];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void remove(Object key) {
        int index = getIndex(key);
        Node head = array[index];
        Node prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    array[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    private int getIndex(Object key) {
        int hashCode = key.hashCode();
        int index = (hashCode & 0x7FFFFFFF) % array.length;
        return index;
    }

    private class Node {
        private Object key;
        private Object value;
        private Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
