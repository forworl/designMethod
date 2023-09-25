package com.example.designmethod;

import com.example.designmethod.factory.BaiShiFactory;
import com.example.designmethod.factory.CocaColaFactory;
import com.example.designmethod.factory.domain.Cola;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    void getCola(){
        final Cola CocaCola = CocaColaFactory.createCola();
        System.out.println(CocaCola);

        final Cola BaiShi = BaiShiFactory.createCola();
        System.out.println(BaiShi);
    }
}
