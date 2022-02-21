package lesson4.set;

import java.util.*;

public class ExampleMain {

    public static void main(String[] args) {

        Set<String> stringSet = new Set<String>() {
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
            public boolean add(String s) {
                return false;
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
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };


        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("123");
        stringHashSet.add("456");
        stringHashSet.add("789");
        Set<String> stringSet_ = Set.of("123","456","789");

        SortedSet<String> stringSortedSet = new SortedSet<String>() {
            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public SortedSet<String> subSet(String fromElement, String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> headSet(String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> tailSet(String fromElement) {
                return null;
            }

            @Override
            public String first() {
                return null;
            }

            @Override
            public String last() {
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
            public boolean add(String s) {
                return false;
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
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        NavigableSet<String> navigableSet = new NavigableSet<String>() {
            @Override
            public String lower(String s) {
                return null;
            }

            @Override
            public String floor(String s) {
                return null;
            }

            @Override
            public String ceiling(String s) {
                return null;
            }

            @Override
            public String higher(String s) {
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
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public NavigableSet<String> descendingSet() {
                return null;
            }

            @Override
            public Iterator<String> descendingIterator() {
                return null;
            }

            @Override
            public NavigableSet<String> subSet(String fromElement, boolean fromInclusive, String toElement, boolean toInclusive) {
                return null;
            }

            @Override
            public NavigableSet<String> headSet(String toElement, boolean inclusive) {
                return null;
            }

            @Override
            public NavigableSet<String> tailSet(String fromElement, boolean inclusive) {
                return null;
            }

            @Override
            public SortedSet<String> subSet(String fromElement, String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> headSet(String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> tailSet(String fromElement) {
                return null;
            }

            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public String first() {
                return null;
            }

            @Override
            public String last() {
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
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
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
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("100");
        hashSet.add("25");
        hashSet.add("50");
        hashSet.add("300");
        System.out.println(hashSet.toString());

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("100");
        treeSet.add("25");
        treeSet.add("50");
        treeSet.add("300");
        System.out.println(treeSet.toString());

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("100");
        linkedHashSet.add("25");
        linkedHashSet.add("50");
        linkedHashSet.add("300");
        System.out.println(linkedHashSet.toString());



    }
}
