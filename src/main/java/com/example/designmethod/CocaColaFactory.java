package com.example.designmethod;

import com.example.designmethod.domain.*;

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
