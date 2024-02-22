public class gopmang {
    public static void main(String[] args) {
        int [] mang1= { 1,2,3,4,5};
        int [] mang2= {6,7,8,9,10};
        int sizemang3= mang1.length+mang2.length;
        int[] mang3= new int[sizemang3];
        System.arraycopy(mang1,0,mang3,0,mang1.length);
        System.arraycopy(mang2,0,mang3,mang1.length,mang2.length);
        System.out.println(" mảng sau khi gop");
        for (int k = 0; k < mang3.length; k++) {
            System.out.print(mang3[k] + " ");
        }
    }
}
