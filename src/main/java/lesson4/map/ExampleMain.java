package lesson4.map;

import java.util.*;

public class ExampleMain {

    public static void main(String[] args) {

        Map<String,String> stringStringMap = new Map<String, String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(String key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends String> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<String, String>> entrySet() {
                return null;
            }
        };

        SortedMap<String,String> stringStringSortedMap = new SortedMap<String, String>() {
            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public SortedMap<String, String> subMap(String fromKey, String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, String> headMap(String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, String> tailMap(String fromKey) {
                return null;
            }

            @Override
            public String firstKey() {
                return null;
            }

            @Override
            public String lastKey() {
                return null;
            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<String, String>> entrySet() {
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
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(String key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends String> m) {

            }

            @Override
            public void clear() {

            }
        };

        NavigableMap<String,String> navigableMap = new NavigableMap<String, String>() {
            @Override
            public Entry<String, String> lowerEntry(String key) {
                return null;
            }

            @Override
            public String lowerKey(String key) {
                return null;
            }

            @Override
            public Entry<String, String> floorEntry(String key) {
                return null;
            }

            @Override
            public String floorKey(String key) {
                return null;
            }

            @Override
            public Entry<String, String> ceilingEntry(String key) {
                return null;
            }

            @Override
            public String ceilingKey(String key) {
                return null;
            }

            @Override
            public Entry<String, String> higherEntry(String key) {
                return null;
            }

            @Override
            public String higherKey(String key) {
                return null;
            }

            @Override
            public Entry<String, String> firstEntry() {
                return null;
            }

            @Override
            public Entry<String, String> lastEntry() {
                return null;
            }

            @Override
            public Entry<String, String> pollFirstEntry() {
                return null;
            }

            @Override
            public Entry<String, String> pollLastEntry() {
                return null;
            }

            @Override
            public NavigableMap<String, String> descendingMap() {
                return null;
            }

            @Override
            public NavigableSet<String> navigableKeySet() {
                return null;
            }

            @Override
            public NavigableSet<String> descendingKeySet() {
                return null;
            }

            @Override
            public NavigableMap<String, String> subMap(String fromKey, boolean fromInclusive, String toKey, boolean toInclusive) {
                return null;
            }

            @Override
            public NavigableMap<String, String> headMap(String toKey, boolean inclusive) {
                return null;
            }

            @Override
            public NavigableMap<String, String> tailMap(String fromKey, boolean inclusive) {
                return null;
            }

            @Override
            public SortedMap<String, String> subMap(String fromKey, String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, String> headMap(String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, String> tailMap(String fromKey) {
                return null;
            }

            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public String firstKey() {
                return null;
            }

            @Override
            public String lastKey() {
                return null;
            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<String, String>> entrySet() {
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
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(String key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends String> m) {

            }

            @Override
            public void clear() {

            }
        };

        HashMap<String, String> hashMap = new HashMap<>();
        TreeMap<String,String> treeMap = new TreeMap<>();
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
    }
}
