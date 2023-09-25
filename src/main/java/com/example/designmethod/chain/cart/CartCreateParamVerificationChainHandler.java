package com.example.designmethod.chain.cart;

import org.springframework.stereotype.Component;

@Component
public class CartCreateParamVerificationChainHandler implements CartCreateChainFilter{
    @Override
    public void handler(Object requestParam) {
        System.out.println("cart执行1方法");
    }

//    @Override
//    public String mark() {
//        return null;
//    }

    @Override
    public int getOrder() {
        return 1;
    }
}
