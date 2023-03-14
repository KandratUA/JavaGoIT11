package Module9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        MyStack stack = new MyStack();
        MyQueue<Integer> queue = new MyQueue<>();
        MyLinkedList<String> list = new MyLinkedList<>();
        MyArrayList<String> lists = new MyArrayList<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map.get("two"));
        map.remove("two");
        System.out.println(map.get("two"));
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());
        System.out.println(map.get("one"));


        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + Arrays.toString(stack.elements));


        stack.remove(1);
        System.out.println("Stack after removing element at index 1: " + Arrays.toString(stack.elements));


        stack.clear();
        System.out.println("Stack after clearing: " + Arrays.toString(stack.elements));


        stack.push(4);
        stack.push(5);
        System.out.println("Stack: " + Arrays.toString(stack.elements));


        System.out.println("Peek: " + stack.peek());


        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after popping: " + Arrays.toString(stack.elements));

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue front element: " + queue.peek());
        System.out.println("Queue poll: " + queue.poll());
        System.out.println("Queue poll: " + queue.poll());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue front element: " + queue.peek());
        queue.clear();
        System.out.println("Queue size after clear: " + queue.size());

        list.add("hello");
        list.add("world");
        list.add("!");
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.clear();
        System.out.println(list.size());




        lists.add("apple");
        lists.add("banana");
        lists.add("orange");

        System.out.println(lists.get(0));
        System.out.println(lists.get(1));
        System.out.println(lists.get(2));

        lists.remove(1);

        System.out.println(lists.get(0));
        System.out.println(lists.get(1));

        System.out.println(lists.size());

        lists.clear();

        System.out.println(lists.size());


    }
}
