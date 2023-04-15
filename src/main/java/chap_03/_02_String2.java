package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7)); // index 7부터 시작되고, 이전 내용은 잘림 -> Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"))); // Java라는 index를 찾아서, Java 이후로만 남겨두기 -> Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치 ~ 끝 위치 직전 -> Java and Python and C

        // 공백 제거
        s = "       I love Java.      ";
        System.out.println(s); //        I love Java.
        System.out.println(s.trim());  // I love Java.

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + ", " + s2); // Java, Python
        System.out.println(s1.concat(", ").concat(s2)); // Java, Python
    }
}
