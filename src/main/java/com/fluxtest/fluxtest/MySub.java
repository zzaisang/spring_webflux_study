package com.fluxtest.fluxtest;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/30
 */
public class MySub implements Subscriber<Integer> {

    @Override
    public void onSubscribe(Subscription s) {
        System.out.println();
    }

    @Override
    public void onNext(Integer integer) {
        System.out.println("구독 데이터 전달");
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("구독중 에러");
    }

    @Override
    public void onComplete() {
        System.out.println("구독 완료");
    }
}
