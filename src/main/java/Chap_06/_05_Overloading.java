package Chap_06;


public class _05_Overloading {

    public static int getPower(int num) {
        int result = num * num;
        return result;
        // return num * num;
    }

    public static int getPower(String strNum) {
        int num = Integer.parseInt(strNum);
        return num * num;
    }

    public static int getPower(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩: 같은 이름의 메소드를 여러 개 선언하는 것.
        // 1. 전달값의 type이 다르거나, *반환값의 type이 다를 때는 불가
        // 2. 전달값의 개수가 다를 때
        System.out.println(getPower(4)); // 16
        System.out.println(getPower("4")); // 16
        System.out.println(getPower(3, 3)); // 27
    }
}
