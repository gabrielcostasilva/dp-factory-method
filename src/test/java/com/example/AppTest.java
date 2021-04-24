package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.UUID;

import com.example.factory.Factory;

import org.junit.jupiter.api.Test;

public class AppTest {

    private Factory factory;

    @Test
    public void shouldAnswerWithTrue() {
        
        final UUID service1 = UUID.randomUUID();
        final UUID service2 = UUID.randomUUID();
        final UUID service3 = UUID.randomUUID();

        assertNotNull(Factory.CITY.getInstance(service1).getData(1L, List.of(1L, 2L)));
        assertNotNull(Factory.CITY.getInstance(service2).getData(1L, List.of(1L, 2L)));
        assertNotNull(Factory.CITY.getInstance(service3).getData(1L, List.of(1L, 2L)));
        assertNotNull(Factory.FARMER.getInstance(service1).getData(1L, List.of(1L, 2L)));
        assertNotNull(Factory.FARMER.getInstance(service2).getData(1L, List.of(1L, 2L)));
        assertNotNull(Factory.FARMER.getInstance(service3).getData(1L, List.of(1L, 2L)));
        assertNotNull(Factory.REGION.getInstance(service3).getData(1L, List.of(1L, 2L)));
        assertNotNull(Factory.REGION.getInstance(service3).getData(1L, List.of(1L, 2L)));
        assertNotNull(Factory.REGION.getInstance(service3).getData(1L, List.of(1L, 2L)));
    }

}