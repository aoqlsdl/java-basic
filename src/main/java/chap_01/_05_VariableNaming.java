package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. _, 문자, 숫자 사용 가능 (공백 사용 불가)
        // 3. _, 문자로 시작할 수 있음 (숫자로 시작 불가)
        // 4. 한 단어 혹은 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, boolean, ...)

        // 다른 나라 입국을 하기 위한 입국 신고서 (여행)
        String nationality = "Republic of Korea"; // 국적
        String firstName = "Hyebin"; // 이름
        String lastName = "Kim"; // 성
        String dateOfBirth = "2000-09-24"; // 생년월일
        String residentialAddress = "신라 호텔"; // 체류지
        String purposeOfVisit = "여행"; // 입국 목적
        String flightNo = "OZ129"; // 항공편명
        String _flightNo = "OZ129"; // 항공편명 - _로 시작
        String flight_no_2 = "OZ129"; // 항공편명 - _과 숫자 포함
        // String -flightNo = "OZ129" // 항공편명 - -로 시작 불가
        // String 03flightNo = "OZ129" // 항공편명 - 숫자로 시작 불가

        // 프로그램의 흐름을 위해 사용하는 경우 등 크게 이름이 중요하지 않을 때는 a, i, x 등으로 정할 수 있음.
        int a = 0;
        int i = 34;
        int x = -3;

        // 절대 변하지 않는 상수의 경우 대문자로 시작
        final String CODE = "KR"; // final - 상수
    }
}
