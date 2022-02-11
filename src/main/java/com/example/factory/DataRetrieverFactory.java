package com.example.factory;

import com.example.product.AbstractDataRetriever;

public sealed abstract class DataRetrieverFactory 
    permits CityDataRetrieverFactory, FarmerDataRetrieverFactory, RegionDataRetrieverFactory {

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