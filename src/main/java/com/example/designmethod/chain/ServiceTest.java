package com.example.designmethod.chain;

import com.example.designmethod.DesignMethodApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = DesignMethodApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceTest {

    @Resource
    private AbstractChainContext<Object> abstractChainContext;

    @Test
    public void test() {
        abstractChainContext.handler("0", 0);
    }
}
