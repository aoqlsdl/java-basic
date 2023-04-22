package Chap_06;

public class _Quiz_06 {
    // 개인정보 중 일부를 비공개로 전환하는 프로그램

    // 조건
    // 1. 개인정보를 비공개로 전환하는 메소드 작성
    // 2. 하나의 메소드에서 모든 동작 처리
    // 3, 각 정보는 김**, 000000-0******, 010-0000-****로 표기
    public static String getHiddenData(String personalInfo, int startPoint) {
        // 0번째 idx부터 startPoint-1번째 idx까지.
        String privateInfo = personalInfo.substring(0, startPoint); // 이름: 김, 주민번호: 000000-0, 전화번호: 010-1234-
        for (int i = 0; i < personalInfo.substring(startPoint).length(); i++) { // privateInfo 바로 다음에 ** 붙이기
            privateInfo += "*";
        }
        return privateInfo;
    }

    public static void main(String[] args) {
        String name = "김혜빈"; // 이름
        String id = "000000-0000000"; // 주민번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름: " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));
    }
}
