package com.dzq;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class TestUUID {
    @Test
    public void testUUID(){
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

    }
}
