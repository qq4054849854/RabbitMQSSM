package com.sykj.util;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class RmqConsumer {
	private static Logger log=Logger.getLogger(RmqConsumer.class);
	public static Object rmqProducerMessage(Object object) throws Exception{  
        RabbitMessage rabbitMessage=(RabbitMessage) object; 
        log.info("从队列里头取出：bean名-"+rabbitMessage.getBeanName()+",方法名："+rabbitMessage.getMethodName());
        Object o = SpringUtil.getBean(rabbitMessage.getBeanName());
        Class clazz = o.getClass(); 
        Method m=clazz.getDeclaredMethod(rabbitMessage.getMethodName(), rabbitMessage.getParamTypes());
        Object invoke = m.invoke(o,rabbitMessage.getParams());
        return 	invoke;
    }

}
