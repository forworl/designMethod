package com.example.designmethod.factory;

import com.example.designmethod.factory.domain.*;

public class BaiShiFactory {

    public static Cola createCola(){
        return new BaiShiCola();
    };

    public static Bottle createBottle(){
        return new BaiShiColaBottle();
    };

    public static Box createBox(){
        return new BaiShiColaBox();
    };
}
