package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 치킨 주문 손님 중 노쇼 손님이 있다고 가정
        // For
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 0; i < 51; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            if (sold == max) {
                System.out.println("준비한 재료가 모두 소진되었습니다.");
                break;
            }

            sold++; // 판매 처리
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("===========================");

        // while문
        int index = 0; // 주문번호
        sold = 0;
        while (index < 51) { // while (true)라고 적어줘도 괜찮음
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;

            if (sold == max) {
                System.out.println("준비한 재료가 모두 소진되었습니다.");
                break;
            }
        }
    }
}
