package org.ouch.ficus;

public final class CacheConstructor {
    private CacheConstructor() {
    }

    public static <K, V> Cache<K, V> constructDefault(String cacheName) {
        return new ConcurrentHashMapCache<>(cacheName);
    }
}
