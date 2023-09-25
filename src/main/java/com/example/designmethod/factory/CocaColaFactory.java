package com.example.designmethod.factory;

import com.example.designmethod.factory.domain.*;

public class CocaColaFactory {

    public static Cola createCola(){
        return new CocaCola();
    };

    public static Bottle createBottle(){
        return new CocaColaBottle();
    };

    public static Box createBox(){
        return new CocaColaBox();
    };
}
