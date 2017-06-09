package com.oa.mapper;

import org.junit.Test;

/**
 * Created by bran on 2017/6/7.
 */
public class ClasspathTest {
    @Test
    public void testClasspath(){
        for (String s : System.getProperty("java.class.path").split(";")) {
            System.out.println(s);
        }
    }
}
