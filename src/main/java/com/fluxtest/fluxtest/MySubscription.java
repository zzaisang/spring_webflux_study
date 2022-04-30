package com.fluxtest.fluxtest;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/30
 */
//구독 정보(구독자, 어떤 데이터를 구독할지)
public class MySubscription implements Subscription {

    private Subscriber s;
    private Iterator<Integer> it;

    public MySubscription(Subscriber s, Iterable<Integer> it) {
        this.s = s;
        this.it = it.iterator();
    }

    @Override
    public void request(long n) {
        while (n > 0){
            if (it.hasNext()){
                s.onNext(it.next());
            }else {
                s.onComplete();
                break;
            }
            n--;
        }
    }

    @Override
    public void cancel() {

    }
}
