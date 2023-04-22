package Chap_06;

public class _04_ParameterAndReturn {
//    public static void power(int num) {
//        int result = num * num;
//        System.out.println(num + "의 제곱은 " + result);
//    }
    public static int getPower(int num) {
        int result = num * num;
        return result;
        // return num * num;
    }

//    public static void powerByExp(int num, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= num;
//        }
//        System.out.println(num + "의 " + exponent + "제곱은 " + result);
//    }
    public static int getPowerByExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int retVal = getPower(2);
        System.out.println(retVal); // 4
        retVal = getPower(3);
        System.out.println(retVal); // 9

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal); // 27

        System.out.println(getPowerByExp(2, 4)); // 16
    }
}
