package com.demo.java.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by maobufan on 17/7/11.
 */
public class ForeachTest {

    public static void main(String []args){
        List<String> stringList= Arrays.asList("nihao","zhanghao","lisi");
        stringList.forEach((str)->{
            System.out.print(str+" ");
        });
    }

}
