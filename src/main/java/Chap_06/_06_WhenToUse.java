package Chap_06;

public class _06_WhenToUse {
    public static int getPower(int num) {
        // int result = num * num;
        // return result;
        // return num * num;
        return getPower(num, 2); // 메소드 내에서 메소드 호출 가능
    }
    public static int getPower(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= exponent;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 제곱 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result); // 4

        // 3의 세제곱 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result); // 27

        // 4의 제곱 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); // 16

        System.out.println(getPower(4, 2)); // 16
    }
}
