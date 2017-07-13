package com.demo.java.java8.lambda;

/**
 * Created by maobufan on 17/7/7.
 */
public class TestImpl implements ITest<Integer> {

    @Override
    public String get() {

        return "123";
    }

    @Override
    public String getStr(int a) {
        return a+a+"";
    }

    @Override
    public Integer getT(Integer integer) {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
