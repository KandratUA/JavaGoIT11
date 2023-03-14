package Module9;

public class MyHashMap {

    private int capacity = 16;
    private Node[] buckets = new Node[capacity];

    public void put(Object key, Object value) {
        int hash = key.hashCode() % capacity;
        Node newNode = new Node(key, value);
        if (buckets[hash] == null) {
            buckets[hash] = newNode;
        } else {
            Node currentNode = buckets[hash];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                } else if (currentNode.next == null) {
                    currentNode.next = newNode;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void remove(Object key) {
        int hash = key.hashCode() % capacity;
        if (buckets[hash] != null) {
            if (buckets[hash].key.equals(key)) {
                buckets[hash] = buckets[hash].next;
            } else {
                Node currentNode = buckets[hash];
                while (currentNode.next != null) {
                    if (currentNode.next.key.equals(key)) {
                        currentNode.next = currentNode.next.next;
                        return;
                    }
                    currentNode = currentNode.next;
                }
            }
        }
    }

    public void clear() {
        buckets = new Node[capacity];
    }

    public int size() {
        int count = 0;
        for (Node node : buckets) {
            if (node != null) {
                Node currentNode = node;
                while (currentNode != null) {
                    count++;
                    currentNode = currentNode.next;
                }
            }
        }
        return count;
    }

    public Object get(Object key) {
        int hash = key.hashCode() % capacity;
        if (buckets[hash] != null) {
            Node currentNode = buckets[hash];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    return currentNode.value;
                }
                currentNode = currentNode.next;
            }
        }
        return null;
    }

    private static class Node {
        private Object key;
        private Object value;
        private Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
