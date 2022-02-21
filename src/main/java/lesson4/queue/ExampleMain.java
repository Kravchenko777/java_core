package lesson4.queue;

import java.util.*;

public class ExampleMain {

    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        Deque<String> stringDeque = new Deque<String>() {
            @Override
            public void addFirst(String s) {

            }

            @Override
            public void addLast(String s) {

            }

            @Override
            public boolean offerFirst(String s) {
                return false;
            }

            @Override
            public boolean offerLast(String s) {
                return false;
            }

            @Override
            public String removeFirst() {
                return null;
            }

            @Override
            public String removeLast() {
                return null;
            }

            @Override
            public String pollFirst() {
                return null;
            }

            @Override
            public String pollLast() {
                return null;
            }

            @Override
            public String getFirst() {
                return null;
            }

            @Override
            public String getLast() {
                return null;
            }

            @Override
            public String peekFirst() {
                return null;
            }

            @Override
            public String peekLast() {
                return null;
            }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public void push(String s) {

            }

            @Override
            public String pop() {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Iterator<String> descendingIterator() {
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };


        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add("25");
        stringPriorityQueue.add("100");
        stringPriorityQueue.add("50");
        stringPriorityQueue.add("300");
        System.out.println(stringPriorityQueue.toString());

        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        stringArrayDeque.add("25");
        stringArrayDeque.add("100");
        stringArrayDeque.add("50");
        stringArrayDeque.add("3");
        System.out.println(stringArrayDeque.toString());
    }
}
