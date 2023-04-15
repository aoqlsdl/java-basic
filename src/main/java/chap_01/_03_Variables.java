package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; // 변수 선언
        name = "혜빈";

        int arrHour = 15;

        System.out.println(name + "님 배송이 시작됩니다. " + arrHour + "시에 방문 예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        // 실수값
        double score = 90.5;
        char grade = 'A'; // 한 글자일 때는 작은 따옴표, 여러 글자일 때는 큰 따옴표
        name = "강백호"; // 재할당 가능함

        System.out.println(name + "님의 평균 점수는 " + score + "입니다. 학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);


        // double과 float의 차이점
        double d = 3.14; // 정밀한 실수 데이터를 표현하는 타입
        float f = 3.14f; // 시스템에서는 0.00의 소수값에 대하여 자동으로 double로 인식. 실수값 뒤에 f 혹은 F를 적어주면 float으로 사용 가능
        System.out.println(d);
        System.out.println(f);

        d = 3.14123456789;
        f = 3.14123456789f; // 시스템에서는 0.00의 소수값에 대하여 자동으로 double로 인식. 실수값 뒤에 f 혹은 F를 적어주면 float으로 사용 가능
        System.out.println(d);
        System.out.println(f); // double만큼 정밀하게 표현하지 못함.


        // int i = 1000000000000 // int 자료형이 가질 수 있는 값은 -21억~+21억 사이
        long l = 1000000000000L; // l 혹은 L을 사용하여 long 타입 변수로 사용 가능
        System.out.println(l);
        l = 1_000_000_000_000L; // 위의 1000000000000와 똑같이 출력됨. 보기 더 편함.
        System.out.println(l);
    }
}
