package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // Quiz 3. 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램 작성

        String personalNo;

        personalNo = "123456-12345678";
        System.out.println(personalNo.substring(0, 8));

        personalNo = "000000-0000000";
        System.out.println(personalNo.substring(0, 8));

        // 다른 방법
        System.out.println(personalNo.substring(0, personalNo.indexOf("-")+2));
    }
}
