package com.example.designmethod;

import com.example.designmethod.factory.SimpleFactory;
import com.example.designmethod.factory.domain.Cola;
import org.junit.jupiter.api.Test;

public class simpleFactoryTest {

    @Test
    void getCola(){
        final Cola cola = SimpleFactory.CreateCola(2);
        System.out.println(cola);
    }
}
