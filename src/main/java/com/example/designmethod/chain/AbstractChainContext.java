package com.example.designmethod.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class AbstractChainContext<T> implements CommandLineRunner {

    private final Map<String, List<AbstractChainHandler>> abstractChainHandlerContainer = new HashMap<>();

    @Resource
    ApplicationContext context;

    public void handler(String mark, T requestParam){
        abstractChainHandlerContainer.get(mark).stream().sorted(Comparator.comparing(Ordered::getOrder))
                .forEach(each -> each.handler(requestParam));
    }

    /**
     * 将ioc容器中的AbstractChainHandler的具体业务子类,根据mark分类之后,放入abstractChainHandlerContainer
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        final Map<String, AbstractChainHandler> chainFilterMap = context.getBeansOfType(AbstractChainHandler.class);
        chainFilterMap.forEach((beanName, bean) -> {
            List<AbstractChainHandler> abstractChainHandlers = abstractChainHandlerContainer.get(bean.mark());
            if (CollectionUtils.isEmpty(abstractChainHandlers)) {
                abstractChainHandlers = new ArrayList<>();
            }
            abstractChainHandlers.add(bean);
            final List<AbstractChainHandler> actual = abstractChainHandlers.stream().sorted(Comparator.comparing(Ordered::getOrder)).collect(Collectors.toList());
            abstractChainHandlerContainer.put(bean.mark(), actual);
        });
    }
}
