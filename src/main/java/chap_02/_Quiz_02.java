package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // Quiz 2. 어린이 키에 따른 놀이기구 탑승 여부를 확인하는 프로그램 작성
        int height = 120;

        String permission = (height >= 120) ? "키가 " + height + "cm이므로 탑승 가능합니다." : "키가 " + height + "cm이므로 탑승 불가능합니다.";
        System.out.println(permission);

        height = 115;
        // permission은 여전히 height = 120일 때 도출된 값(탑승 가능)을 가지고 있으므로 재할당해야 함
        permission = (height >= 120) ? "키가 " + height + "cm이므로 탑승 가능합니다." : "키가 " + height + "cm이므로 탑승 불가능합니다.";
        System.out.println(permission);
    }
}
