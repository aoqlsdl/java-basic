package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 1등: 전액 장학금
        // 2등: 반액 장학금
        // 3등: 반액 장학금
        // 그 외: 장학금 대상 아님


        // 1. if else문을 이용: 여러 조건 또는 범위에 해당하는 조건
        int ranking; // 등수
        ranking = 4;

        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");


        // 2. switch case문을 이용: 명확한 case가 있는 경우
        ranking = 1;

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 2와 3을 통합
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격 책정 (1급: 최상, 4급: 최하)
        int grade = 4;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }

        System.out.println(grade + "등급 제품의 가격: " + price);
        // 1등급: 10000원
        // 2등급: 9000원
        // 3등급: 8000원
        // 4등급: 7000원
    }
}
