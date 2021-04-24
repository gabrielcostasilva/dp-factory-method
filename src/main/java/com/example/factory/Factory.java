package com.example.factory;

import java.util.UUID;

import com.example.product.AbstractDataRetriever;
import com.example.product.CityDataRetriever;
import com.example.product.FarmerDataRetriever;
import com.example.product.RegionDataRetriever;

public enum Factory {
    CITY {
        @Override
        public AbstractDataRetriever<String> getInstance(UUID service) {
            return new CityDataRetriever(service);
        }
    },
    FARMER {
        @Override
        public AbstractDataRetriever<Long> getInstance(UUID service) {
            return new FarmerDataRetriever(service);
        }
    },
    REGION {
        @Override
        public AbstractDataRetriever<Integer> getInstance(UUID service) {
            return new RegionDataRetriever(service);
        }
    };

    public abstract AbstractDataRetriever getInstance(final UUID service);   
}
