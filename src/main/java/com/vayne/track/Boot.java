package com.vayne.track;

import com.vayne.track.dyproxy.LogHandler;
import com.vayne.track.inf.Hello;

import java.lang.reflect.Proxy;

/**
 * @author Volcanno
 * @date 2019-11-7 00:29:20
 */
public class Boot {

    public static void main(String[] args) {
        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[]{Hello.class}, new LogHandler());
        hello.morning();
        hello.evening();
    }
}
