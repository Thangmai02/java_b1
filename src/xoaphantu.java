import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        int[] mang = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println(" mang ban dau");
        for (int a = 0; a < mang.length; a++) {
            System.out.print(mang[a] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nso muon xoa ");
        int removeNumber = scanner.nextInt();
        int newsize = mang.length;
        for (int i = 0; i < newsize; i++) {
            if (removeNumber == mang[i]) {
                for (int j = i; j < newsize - 1; j++) {
                    mang[j] = mang[j + 1];
                }
                newsize--;
                i--;
            }
        }
        System.out.println(" mảng sau khi xoa");
        for (int k = 0; k < newsize; k++) {
            System.out.print(mang[k] + " ");
        }
    }
}
