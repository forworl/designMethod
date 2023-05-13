package com.example.designmethod;

import com.example.designmethod.domain.BaiShiCola;
import com.example.designmethod.domain.CocaCola;
import com.example.designmethod.domain.Cola;

public class BaiShiFactory {

    public static Cola createCola(){
        return new BaiShiCola();
    };
}
