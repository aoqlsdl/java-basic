package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // 이화 매장
        System.out.println("어서오세요. 이화입니다.");

        // 또 다른 손님이 들어오면?
        System.out.println("어서오세요. 이화입니다.");
        System.out.println("어서오세요. 이화입니다.");
        System.out.println("어서오세요. 이화입니다.");
        System.out.println("어서오세요. 이화입니다.");
        System.out.println("어서오세요. 이화입니다.");
        System.out.println("어서오세요. 이화입니다.");
        System.out.println("어서오세요. 이화입니다.");

        // 인사법이 바뀌면?
        System.out.println("환영합니다. 이화입니다.");
        System.out.println("환영합니다. 이화입니다.");
        System.out.println("환영합니다. 이화입니다.");
        System.out.println("환영합니다. 이화입니다.");

        // 매장의 이름이 바뀌면?
        System.out.println("환영합니다. 이펍입니다.");
        System.out.println("환영합니다. 이펍입니다.");
        System.out.println("환영합니다. 이펍입니다.");


        // 반복문 사용
        System.out.println("======== 반복문 사용 ========");
        for (int i=0; i<10; i++) {
            // System.out.println("어서오세요. 이화입니다." + i);
            // System.out.println("환영합니다. 이화입니다." + i);
            System.out.println("환영합니다. 이펍입니다." + i);
        }

        // 짝수만 출력
        for (int i = 0; i < 10 ; i+=2) {
            System.out.print(i);
        }

        System.out.println(); // 줄바꿈

        // 홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지 숫자의 합
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
            System.out.println("현재까지의 총합은 " + sum + "입니다.");
        }
        System.out.println("모든 수의 총합은 " + sum + "입니다.");
    }
}
