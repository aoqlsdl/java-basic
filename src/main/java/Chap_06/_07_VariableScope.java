package Chap_06;

public class _07_VariableScope {
    public static void methodA() {
        // System.out.println(num); // 사용 불가
        // System.out.println(result); // 사용 불가
    }

    public static void methodB() {
        int result = 1; // 지역변수
    }
    public static void main(String[] args) {
        int num = 3;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i); // 중괄호 안에서만 i 사용 가능

        {
            int j = 0;
            System.out.println(j);
        }
        // System.out.println(j); // 중괄호 안에서만 j 사용 가능
    }
}
