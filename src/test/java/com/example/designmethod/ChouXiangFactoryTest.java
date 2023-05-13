package com.example.designmethod;

import com.example.designmethod.domain.Bottle;
import com.example.designmethod.domain.Box;
import com.example.designmethod.domain.Cola;
import org.junit.jupiter.api.Test;

public class ChouXiangFactoryTest {

    @Test
    void getCocaCola(){
        final Cola cola = CocaColaFactory.createCola();
        System.out.println(cola);

        final Bottle bottle = CocaColaFactory.createBottle();
        System.out.println(bottle);

        final Box box = CocaColaFactory.createBox();
        System.out.println(box);
    }

    @Test
    void getBaiShiCola(){
        final Cola cola = BaiShiFactory.createCola();
        System.out.println(cola);

        final Bottle bottle = BaiShiFactory.createBottle();
        System.out.println(bottle);

        final Box box = BaiShiFactory.createBox();
        System.out.println(box);
    }
}
