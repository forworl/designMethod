package com.example.designmethod.factory;

import com.example.designmethod.factory.domain.BaiShiCola;
import com.example.designmethod.factory.domain.CocaCola;
import com.example.designmethod.factory.domain.Cola;

public class SimpleFactory {

    public static Cola CreateCola(Integer type){
        switch (type){
            case 1:
                return new CocaCola();
            case 2:
                return new BaiShiCola();
            default:
                return null;
        }
    }
}
