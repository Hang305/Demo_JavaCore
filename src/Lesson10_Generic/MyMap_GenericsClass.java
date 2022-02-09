package Lesson10_Generic;

import java.util.Objects;

public class MyMap_GenericsClass<K, V> {

    private K key;
    private V value;

    public MyMap_GenericsClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {

        MyMap_GenericsClass<Integer, String> mymap1 = new MyMap_GenericsClass(1, "one");
        MyMap_GenericsClass<String, Integer> mymap2 = new MyMap_GenericsClass("two", 2);
        System.out.println(mymap1.getKey() + " " + mymap1.getValue());
        System.out.println(mymap2.getKey() + " " + mymap2.getValue());
    }
}
