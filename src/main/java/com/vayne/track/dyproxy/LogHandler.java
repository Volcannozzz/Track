package com.vayne.track.dyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Volcanno
 * @date 2019-11-7 00:00:00
 */
public class LogHandler implements InvocationHandler {

    private Object proxyTarget;

    public void setProxyTarget(Object proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method Name: " + method.getName());
//        method.invoke(proxyTarget, args);
        return null;
    }
}
