package com.example.designmethod;

import com.example.designmethod.domain.BaiShiCola;
import com.example.designmethod.domain.CocaCola;
import com.example.designmethod.domain.Cola;

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
