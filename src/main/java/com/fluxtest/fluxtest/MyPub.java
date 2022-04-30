package com.fluxtest.fluxtest;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/30
 */
public class MyPub implements Publisher<Integer> {

    @Override
    public void subscribe(Subscriber<? super Integer> s) {
        System.out.println("1. 신문사야 너네 신문 볼게");
    }
}
