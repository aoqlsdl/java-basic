package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // Quiz 4. 주차 요금 정산 프로그램
        int price = 4000; // 시간당 주차 요금
        int maxPrice = 30000; // 하루 최대 주차 요금
        int hour; // 주차 시간
        boolean isSmallCar; // 경차 여부
        boolean isDisabled; // 장애 여부

        // Case 1. 일반 차량 5시간 주차시
        hour = 10;
        isSmallCar = false;
        isDisabled = false;
        int finalPrice = 0;

        for (int i = 1; i < hour + 1; i++) {

            if (finalPrice >= maxPrice) {
                finalPrice = maxPrice;
                break;
            }

            finalPrice += price;

        }

        if (isSmallCar || isDisabled) {
            finalPrice = finalPrice / 2;
        }

        System.out.println("주차 요금은 " + finalPrice + "원입니다.");
        System.out.println("=================================");

        // Case 2. 경차 5시간 주차시
        hour = 5;
        isSmallCar = true;
        isDisabled = false;
        finalPrice = 0;

        for (int i = 1; i < hour + 1; i++) {

            if (finalPrice >= maxPrice) {
                finalPrice = maxPrice;
                break;
            }

            finalPrice += price;

        }

        if (isSmallCar || isDisabled) {
            finalPrice = finalPrice / 2;
        }

        System.out.println("주차 요금은 " + finalPrice + "원입니다.");
        System.out.println("=================================");

        // Case 3. 장애인 차량 10시간 주차시
        hour = 10;
        isSmallCar = false;
        isDisabled = true;
        finalPrice = 0;

        for (int i = 1; i < hour + 1; i++) {

            if (finalPrice >= maxPrice) {
                finalPrice = maxPrice;
                break;
            }

            finalPrice += price;

        }

        if (isSmallCar || isDisabled) {
            finalPrice = finalPrice / 2;
        }

        System.out.println("주차 요금은 " + finalPrice + "원입니다.");
    }
}
