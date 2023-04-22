package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m

        while (move < distance) {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        // 무한 루프
        move = 0;
        while (move < distance) {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리: " + move);
            // 탈출 조건 정해줘야 함.
        }
        System.out.println("도착했습니다.");
    }

}
