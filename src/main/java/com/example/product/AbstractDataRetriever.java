package com.example.product;

import java.util.List;
import java.util.UUID;

public abstract class AbstractDataRetriever<E> {

    protected final UUID service;

    public AbstractDataRetriever(
        final UUID service ) {
        this.service = service;
    }

    public abstract List<E> getData(Long id, List<Long> selection);
}