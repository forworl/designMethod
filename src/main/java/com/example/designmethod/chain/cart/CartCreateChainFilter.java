package com.example.designmethod.chain.cart;

import com.example.designmethod.chain.AbstractChainHandler;

public interface CartCreateChainFilter<T> extends AbstractChainHandler {

    @Override
    default String mark() {
        return "0";
    }

}
