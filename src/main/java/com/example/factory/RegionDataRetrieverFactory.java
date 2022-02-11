package com.example.factory;

import java.util.UUID;

import com.example.product.AbstractDataRetriever;
import com.example.product.RegionDataRetriever;

public final class RegionDataRetrieverFactory 
        extends DataRetrieverFactory {

    @Override
    public AbstractDataRetriever<Integer> getDataRetriver() {
        
        return new RegionDataRetriever(UUID.randomUUID());
    }
    
}
