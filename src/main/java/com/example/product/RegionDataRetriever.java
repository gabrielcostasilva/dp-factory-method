package com.example.product;

import java.util.List;
import java.util.UUID;

public class RegionDataRetriever 
        extends AbstractDataRetriever<Integer> {

    public RegionDataRetriever(UUID service) {
        super(service);
    }

    @Override
    public List<Integer> getData(Long id, List<Long> selection) {
        return List.of(service.hashCode());
    }
}
