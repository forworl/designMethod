package com.example.designmethod.chain.order;

import org.springframework.stereotype.Component;

@Component
public class OrderCreateParamNotNullChainHandler implements OrderCreateChainFilter{
    @Override
    public void handler(Object requestParam) {
        System.out.println("执行0方法");
    }

//    @Override
//    public String mark() {
//        return null;
//    }

    @Override
    public int getOrder() {
        return 0;
    }
}
