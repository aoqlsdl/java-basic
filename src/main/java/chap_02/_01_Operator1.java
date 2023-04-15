package chap_02;

import jdk.jshell.EvalException;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2.5 -> 정수 연산일 때는 2
        System.out.println(2 / 4); // 0.5 -> 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0


        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // val+1한 후 sout -> 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // sout한 후 val+1 -> 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기번호표
        int waiting = 0;
        System.out.println("대기 인원: " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원: " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원: " + waiting++); // 대기 인원 : 2
        System.out.println("대기 인원: " + waiting); // 대기 인원 : 3
    }
}
