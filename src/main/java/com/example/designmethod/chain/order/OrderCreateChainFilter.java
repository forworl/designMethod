package com.example.designmethod.chain.order;

import com.example.designmethod.chain.AbstractChainHandler;

import java.util.UUID;

public interface OrderCreateChainFilter<T> extends AbstractChainHandler {

    @Override
    default String mark() {
        return "1";
    }

}
