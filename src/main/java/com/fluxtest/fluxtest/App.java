package com.fluxtest.fluxtest;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/30
 */
public class App {

    public static void main(String[] args) {
        MyPub pub = new MyPub();
        MySub sub = new MySub();
        pub.subscribe(sub);
    }
}
