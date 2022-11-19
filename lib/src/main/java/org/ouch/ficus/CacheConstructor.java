package org.ouch.ficus;

public class CacheConstructor {
    public <K, V> Cache<K, V> constructDefault(String cacheName) {
        return new ConcurrentHashMapCache<>(cacheName);
    }
}
