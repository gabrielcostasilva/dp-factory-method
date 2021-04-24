package com.example.product;

import java.util.List;
import java.util.UUID;

public class FarmerDataRetriever 
        extends AbstractDataRetriever<Long> {

    public FarmerDataRetriever(UUID service) {
        super(service);
    }

    @Override
    public List<Long> getData(Long id, List<Long> selection) {
        return List.of(service.getMostSignificantBits());
    }    
}
