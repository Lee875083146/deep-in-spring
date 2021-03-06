package com.nopainanymore.deepinspring.aop.cglib;

/**
 * deep-in-spring: CGLibTest
 *
 * @author NoPainAnymore
 * @date 2019-05-04 17:53
 */
public class CGLibTest {


    public static void main(String[] args) {
        EClass eClass = new EClass();
        CGLibProxy proxy = new CGLibProxy(eClass);
        proxy.createProxy().execute();
    }
}
