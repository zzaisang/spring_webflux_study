package com.fluxtest.fluxtest;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/30
 */
public class MySub implements Subscriber<Integer> {

    private Subscription s;
    private int bufferSize = 3;//신문을 몇개씩 구독(받을지)할지 개수

    @Override
    public void onSubscribe(Subscription s) {
        System.out.println("구독자 : 구독 정보 잘 받았어");
        this.s = s;
        System.out.println("구독자 : 나 이제 신문 1개씩 줘");
        s.request(bufferSize); //신문 한개씩 매일 매일 줘 !! (백프레셔) 소비자가 한번에 처리할 수 있는 개수를 요청
    }

    @Override
    public void onNext(Integer t) {
        System.out.println("onNext() : " + t);
        bufferSize--;
        if (bufferSize == 0){
            System.out.println("하루 지남");
            bufferSize = 3;
            s.request(bufferSize);
        }
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
