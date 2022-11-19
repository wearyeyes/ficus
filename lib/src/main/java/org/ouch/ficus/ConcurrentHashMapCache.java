package org.ouch.ficus;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapCache<K, V> implements Cache<K, V> {

    private final String cacheName;
    private final Map<K, V> cache = new ConcurrentHashMap<>();

    public ConcurrentHashMapCache(String cacheName) {
        this.cacheName = cacheName;
    }

    @Override
    public V get(K key) {
        return cache.get(key);
    }

    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public void delete(K key) {
        cache.remove(key);
    }

    @Override
    public String getCacheName() {
        return cacheName;
    }
}
