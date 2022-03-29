package com.company.day_27;

public class DefaultPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public DefaultPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public K getKey() {
        return getKey();
    }

    @Override
    public V getValue() {
        return getValue();
    }
}
