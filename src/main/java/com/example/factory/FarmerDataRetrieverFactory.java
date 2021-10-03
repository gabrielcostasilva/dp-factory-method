package com.example.factory;

import java.util.UUID;

import com.example.product.AbstractDataRetriever;
import com.example.product.FarmerDataRetriever;

public class FarmerDataRetrieverFactory 
        extends DataRetrieverFactory {

    @Override
    public AbstractDataRetriever<Long> getDataRetriver() {
        
        return new FarmerDataRetriever(UUID.randomUUID());
    }
    
}
