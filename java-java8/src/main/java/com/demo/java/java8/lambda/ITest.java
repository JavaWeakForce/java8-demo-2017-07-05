package com.demo.java.java8.lambda;

import java.util.Objects;

/**
 * Created by maobufan on 17/7/6.
 */
//@FunctionalInterface
public interface ITest<T> {

    String get();

    default String getStr(int a){
        return  a+"";
    }

    default T getT(T t){
        return t;
    }
    @Override
    boolean equals(Object var1);



}
