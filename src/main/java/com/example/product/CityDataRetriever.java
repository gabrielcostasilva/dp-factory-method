package com.example.product;

import java.util.List;
import java.util.UUID;

public class CityDataRetriever 
        extends AbstractDataRetriever<String> {

    public CityDataRetriever(UUID service) {
        super(service);
    }

    @Override
    public List<String> getData(Long id, List<Long> selection) {
        return List.of(service.randomUUID().toString());
    }
}
