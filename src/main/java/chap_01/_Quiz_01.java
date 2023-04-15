package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // Quiz 1. 버스 도착 정보를 출력하는 프로그램 작성하기
        String busNo;
        int remainMin;
        float remainDis;

        busNo = "서대문05";
        remainMin = 5;
        remainDis = 1.5F;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + remainMin + "분 후 도착");
        System.out.println("남은 거리 " + remainDis + "km");

        /*
        (실행 결과)
        서대문05번 버스
        약 5분 후 도착
        남은 거리 1.5km
        */
    }
}
