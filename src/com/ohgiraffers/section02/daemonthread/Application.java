package com.ohgiraffers.section02.daemonthread;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 일반 스레드는 메인 스레드가 종료 되어도 본인의 작업을 마저 실행한다.
        * 데몬 스레드로 생성한 스레드는 메인 스레드가 종료 될 때 함께 종료 된다.
        * */
        Thread t = new CountDown();
        Scanner sc = new Scanner(System.in);

        /* setDaemon(true) 설정으로 해당 스레드를 데몬 스레드로 만들 수 있다.
        * 단, start() 호출 이전에 설정해야 한다. */
        t.setDaemon(true);
        t.start();

        System.out.print(" 아무거나 입력하세요 : ");
        String str = sc.nextLine();
        System.out.println("입력한 값 : " + str);
        System.out.println("======== main end");
    }
}
