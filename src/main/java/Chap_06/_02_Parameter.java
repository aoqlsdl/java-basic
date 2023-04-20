package Chap_06;

public class _02_Parameter {
    public static void power(int num) {
        int result = num * num;
        System.out.println(num + "의 제곱은 " + result);
    }

    public static void powerByExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + "의 " + exponent + "제곱은 " + result);
    }
    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4

        // Argument, 인수
        power(2); // 2의 제곱은 4
        power(3); // 3의 제곱은 9

        powerByExp(2, 3); // 2의 3제곱은 8
        powerByExp(3, 3); // 3의 3제곱은 27
        powerByExp(10, 0); // 10의 0제곱은 1
    }
}
