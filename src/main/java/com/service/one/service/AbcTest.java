package com.service.one.service;

import java.util.Comparator;
import java.util.function.Supplier;

@FunctionalInterface
public interface  AbcTest {
//    int a ;
    int b =10;

//    static int c;

    static int d = 10;

    public void test ();

    public  default void test1(int x){

        
    }
}
