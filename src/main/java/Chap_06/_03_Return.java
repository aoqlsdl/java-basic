package Chap_06;

public class _03_Return {
    // 호텔 전화번호, 호텔 주소, 호텔 액티비티, ...
    public static String getPhoneNum() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress() {
        return "서울시 어딘가";
    }

    public static String getActivities() {
        return "볼링장, 탁구장, 농구장";
    }
    public static void main(String[] args) {
        // 반환값, return
        String contactNum = getPhoneNum();
        System.out.println("호텔 전화번호: " + contactNum);

        String address = getAddress();
        System.out.println("호텔 주소: " + address);

        System.out.println("호텔 액티비티: " + getActivities());
    }
}
