package chap_05;

public class _06_Quiz_5 {
    public static void main(String[] args) {
        // Quiz 5. 쇼핑몰에서 구매 가능한 신발 사이즈

        int[] shoes = new int[10];

        for (int i = 0; i < 10; i++) {
            int reps = i * 5;
            shoes[i] = 250 + reps; // 250 + (5 * i)
//            System.out.print("사이즈 ");
//            System.out.print(shoes[i]);
//            System.out.println(" (재고 있음)");
        }

        for (int size :
                shoes) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
