package Module9;


public class MyHashMap<K, V> {

    private Node<K, V>[] buckets;
    private int capacity = 16;
    private int size;


    public MyHashMap(int capacity) {
        this.buckets = new Node[capacity];
        this.size = 0;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets[bucketIndex];

        // Check if key already exists in map
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Add new node to beginning of linked list
        Node<K, V> newNode = new Node<>(key, value, buckets[bucketIndex]);
        buckets[bucketIndex] = newNode;
        size++;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets[bucketIndex];

        // Traverse linked list to find node with matching key
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        // Key not found
        return null;
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets[bucketIndex];
        Node<K, V> prev = null;

        // Traverse linked list to find node with matching key
        while (head != null) {
            if (head.key.equals(key)) {
                // Remove node
                if (prev == null) {
                    buckets[bucketIndex] = head.next;
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
            buckets = new Node[capacity];
            size = 0;
        }


    public int size() {
        return size;
    }

    private int getBucketIndex(K key) {
        return key.hashCode() % buckets.length;
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
