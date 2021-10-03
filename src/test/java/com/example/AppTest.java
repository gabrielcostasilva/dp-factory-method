package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.example.factory.DataRetrieverFactory;
import com.example.factory.DataRetrieverFactory.DataRetriever;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testFactory() {
        
        assertEquals(List.of("City1", "City2", "City3"), DataRetrieverFactory.from(DataRetriever.CITY).getData(1L, List.of(1L, 2L)));
        assertEquals(List.of("City1", "City2", "City3"), DataRetrieverFactory.from(DataRetriever.CITY).getData(1L, List.of(1L, 2L)));
        assertEquals(List.of("City1", "City2", "City3"), DataRetrieverFactory.from(DataRetriever.CITY).getData(1L, List.of(1L, 2L)));

        assertEquals(List.of(1L, 2L, 3L), DataRetrieverFactory.from(DataRetriever.FARMER).getData(1L, List.of(1L, 2L)));
        assertEquals(List.of(1L, 2L, 3L), DataRetrieverFactory.from(DataRetriever.FARMER).getData(1L, List.of(1L, 2L)));
        assertEquals(List.of(1L, 2L, 3L), DataRetrieverFactory.from(DataRetriever.FARMER).getData(1L, List.of(1L, 2L)));

        assertEquals(List.of(1, 2, 3), DataRetrieverFactory.from(DataRetriever.REGION).getData(1L, List.of(1L, 2L)));
        assertEquals(List.of(1, 2, 3), DataRetrieverFactory.from(DataRetriever.REGION).getData(1L, List.of(1L, 2L)));
        assertEquals(List.of(1, 2, 3), DataRetrieverFactory.from(DataRetriever.REGION).getData(1L, List.of(1L, 2L)));
    }

}
