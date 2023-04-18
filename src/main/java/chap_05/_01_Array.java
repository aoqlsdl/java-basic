package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열: 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "Americano";
        String coffeeRachel = "Mocha";
        String coffeeMonica = "Latte";
        String coffeeChandler = "Cappuccino";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println("주세요.");

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[4];

        // 배열 선언 두 번째 방법
        // String coffees[] = new String[4];

        /*coffees[0] = "Americano";
        coffees[1] = "Mocha";
        coffees[2] = "Latte";
        coffees[3] = "Cappuccino";*/

        // 배열 선언 세 번째 방법
        // String[] coffees = new String[] { "Americano", "Macha", "Latte", "Cappuccino" };

        // 배열 선언 네 번째 방법
        String[] coffees = { "Americano", "Macha", "Latte", "Cappuccino" };

        System.out.println("================================");

        // 커피 주문
        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "Espresso"; // 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");

        // 다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[3] = 3;
        double[] d = new double[] {1.1, 2.2, 3.3};
        boolean[] b = {true, true, false};
    }
}
