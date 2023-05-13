package com.example.designmethod;

import com.example.designmethod.domain.CocaCola;
import com.example.designmethod.domain.Cola;

public class CocaColaFactory {

    public static Cola createCola(){
        return new CocaCola();
    };
}
