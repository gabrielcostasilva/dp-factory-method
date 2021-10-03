package com.example.factory;

import java.util.UUID;

import com.example.product.AbstractDataRetriever;
import com.example.product.CityDataRetriever;

public class CityDataRetrieverFactory 
        extends DataRetrieverFactory {

    @Override
    public AbstractDataRetriever<String> getDataRetriver() {
        
        return new CityDataRetriever(UUID.randomUUID());
    }
    
}
