package com.fluxtest.fluxtest;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/30
 */
// webFlux = 단일스레드 , 비동기 + Stream을 통해 백프레셔가 적용된 데이터만큼 간헐적 응답이 가능하다 + 데이터 소비가 끝나면 응답이 종료
// SSE 적용 (Servlet, Webflux) = 데이터 소비가 끝나도 Stream 계속 유지
public class App {

    public static void main(String[] args) {
        MyPub pub = new MyPub();
        MySub sub = new MySub();
        pub.subscribe(sub);
    }
}
