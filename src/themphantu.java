import java.util.Scanner;

public class themphantu {
    public static void main(String[] args) {
        int[] mang = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println(" mang ban dau");
        for (int a = 0; a < mang.length; a++) {
            System.out.print(mang[a] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nso muon them ");
        int addNumber = scanner.nextInt();
        System.out.println("\n vị tri muon them ");
        int indexaddNumber = scanner.nextInt();
        int[] newMang = new int[mang.length + 1];
        System.arraycopy(mang, 0, newMang, 0, indexaddNumber);
        newMang[indexaddNumber] = addNumber;
        System.arraycopy(mang, indexaddNumber, newMang, indexaddNumber + 1, mang.length - indexaddNumber);
        System.out.println(" mảng sau khi them");
        for (int k = 0; k < newMang.length; k++) {
            System.out.print(newMang[k] + " ");
        }
    }}
