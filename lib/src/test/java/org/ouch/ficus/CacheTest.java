package org.ouch.ficus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CacheTest {

    public static final String USERS_CACHE_NAME = "users";
    private static final String USER_ANN = "Ann";
    public static final String USER_MIKE = "Mike";
    public static final String MIKE_USER_ID = "user-1";
    public static final String ANN_USER_ID = "user-2";

    @Test
    void get() {
        Cache<String, String> usersCache = new Cache<>(USERS_CACHE_NAME);
        usersCache.put(MIKE_USER_ID, USER_MIKE);
        assertEquals(USER_MIKE, usersCache.get(MIKE_USER_ID));
    }

    @Test
    void put() {
        Cache<String, String> usersCache = new Cache<>(USERS_CACHE_NAME);
        usersCache.put(ANN_USER_ID, USER_ANN);
        assertEquals(USER_ANN, usersCache.get(ANN_USER_ID));
    }

    @Test
    void delete() {
        Cache<String, String> usersCache = new Cache<>(USERS_CACHE_NAME);
        usersCache.put(MIKE_USER_ID, USER_MIKE);
        assertEquals(USER_MIKE, usersCache.get(MIKE_USER_ID));

        usersCache.delete(MIKE_USER_ID);
        assertNull(usersCache.get(MIKE_USER_ID));
    }

    @Test
    void getCacheName() {
        Cache<String, String> usersCache = new Cache<>(USERS_CACHE_NAME);
        assertEquals(USERS_CACHE_NAME, usersCache.getCacheName());
    }
}