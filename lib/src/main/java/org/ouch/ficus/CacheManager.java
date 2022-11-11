package org.ouch.ficus;

import java.util.HashMap;
import java.util.Map;

/**
 * Registers and stores caches by their names.
 */
public class CacheManager {

    private final Map<String, Cache> registeredCaches = new HashMap<>();

    /**
     * Registers new cache in Cache Manager storage.
     * @param cache a new cache to register.
     */
    public void register(Cache cache) {
        registeredCaches.put(cache.getCacheName(), cache);
    }

    /**
     * Returns Cache object from Cache Manager storage if exists otherwise null.
     * @param cacheName cache name
     * @return Cache object or null
     */
    public Cache getCache(String cacheName) {
        return registeredCaches.get(cacheName);
    }
}
