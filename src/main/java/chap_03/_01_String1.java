package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // I LIKE JAVA AND PYTHON AND C.
        System.out.println(s.toLowerCase()); // i like java and python and c.

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // 위치 정보 : 7
        System.out.println(s.indexOf("C#")); // 포함되지 않으면 -1
        System.out.println(s.indexOf("and")); // 먼저 나오는 and의 위치 정보 : 12
        System.out.println(s.lastIndexOf("and")); // 23
        System.out.println(s.startsWith("I like")); // 특정 문자열로 시작하는지 아닌지 : true
        System.out.println(s.endsWith(".")); // true
    }
}
