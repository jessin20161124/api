package com.jessin.practice.dubbo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    private Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Test
    public void test1() {
        int b = 10;
        String name = "hello";
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            // sl4fj-api 1.6.0最新使用方式
            logger.error("错误信息为：{}", name, e);
            // sl4fj-api 1.6.0之前老的方式
            logger.error(e.getMessage(), e);
        }
    }

}
