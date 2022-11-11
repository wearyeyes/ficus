package org.ouch.ficus;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache<K, V> {

    private final String cacheName;
    private final Map<K, V> cache = new ConcurrentHashMap<>();

    public Cache(String cacheName) {
        this.cacheName = cacheName;
    }

    public V get(K key) {
        return cache.get(key);
    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public void delete(K key) {
        cache.remove(key);
    }

    public String getCacheName() {
        return cacheName;
    }
}
