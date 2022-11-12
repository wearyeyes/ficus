package org.ouch.ficus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CacheManagerTest {

    public static final String USERS_CACHE = "users";

    @Test
    void register() {
        Cache<String, String> usersCache = new Cache<>(USERS_CACHE);
        CacheManager usersCacheManager = new CacheManager();

        usersCacheManager.register(usersCache);
        Assertions.assertNotNull(usersCacheManager.getCache(USERS_CACHE));
    }

    @Test
    void getCache() {
        Cache<String, String> usersCache = new Cache<>(USERS_CACHE);
        CacheManager usersCacheManager = new CacheManager();

        usersCacheManager.register(usersCache);
        Cache registeredCache = usersCacheManager.getCache(USERS_CACHE);
        Assertions.assertNotNull(registeredCache);
        assertEquals(USERS_CACHE, registeredCache.getCacheName());
    }
}