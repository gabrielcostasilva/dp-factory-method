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
        System.out.println("Service: " + this.service);

        return List.of(1L, 2L, 3L);
    }    
}
