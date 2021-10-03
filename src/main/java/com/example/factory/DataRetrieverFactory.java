package com.example.factory;

import com.example.product.AbstractDataRetriever;

public abstract class DataRetrieverFactory {

    public enum DataRetriever {
        CITY, FARMER, REGION;
    }

    public static AbstractDataRetriever from(DataRetriever dataRetriever) {

        switch (dataRetriever) {
            case CITY:
                return new CityDataRetrieverFactory().getDataRetriver();
            case REGION:
                return new RegionDataRetrieverFactory().getDataRetriver();
            case FARMER:
                return new FarmerDataRetrieverFactory().getDataRetriver();
            default:
                return null;
        }
    }

    public abstract AbstractDataRetriever getDataRetriver();
}