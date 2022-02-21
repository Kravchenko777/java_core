package lesson4.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class ExampleMain {

    public static void main(String[] args) {

        Collection<String> collection = new Collection<String>() {
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


        Iterator<String> stringIterator = collection.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        Spliterator<String> stringSpliterator = collection.spliterator();
        stringSpliterator.tryAdvance(str ->System.out.println(str));

        for(String str: collection){
            System.out.println(str);
        }

        collection.stream().peek((str)-> System.out.println(str)).collect(Collectors.toList());
        collection.parallelStream().peek((str)-> System.out.println(str)).collect(Collectors.toList());

    }
}
