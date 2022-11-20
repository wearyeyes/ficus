package org.ouch.ficus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CacheConstructorTest {

    @Test
    void constructDefault() {
        Cache<String, Object> cache = CacheConstructor.constructDefault("simple cache");

        Assertions.assertNotNull(cache);
        Assertions.assertEquals("simple cache", cache.getCacheName());
        Assertions.assertTrue(cache instanceof ConcurrentHashMapCache<String, Object>);
    }
}