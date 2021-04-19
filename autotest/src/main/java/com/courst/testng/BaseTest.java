package com.courst.testng;


import org.testng.annotations.*;

public class BaseTest {
    @Test
    public void testcase1(){
        System.out.println("这个是一个测试用例===Test1");
    };

    @Test
    public void testcase2(){
        System.out.println("这个是一个测试用例===Test2");
    }

    @AfterClass
    public void afterClassiest(){
        System.out.println("这个是AfterClass");
    }

    @BeforeClass
    public void ofterClassist(){
        System.out.println("这个是BeforeClass");
    }


    @BeforeMethod
    public void testBeforeMethod1(){
        System.out.println("这个是BeforeMethod1");
    }

    @AfterMethod
    public void testAfterMethod1(){
        System.out.println("这个是AfterMethod1");
    }

    @BeforeTest
    public void testcaseBefore1(){
        System.out.println("这个是BeforeTest");
    }

    @AfterTest
    public void testcaseAfter1(){
        System.out.println("这个是AfterTest");
    }

    @BeforeSuite
    public void beforesuit(){
        System.out.println("这个是BeforeSuite");
    }

    @AfterSuite
    public void aftersuit(){
        System.out.println("这个是AfterSuite");
    }

}

