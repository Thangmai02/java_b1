public class mang {
    public static void main(String[] args) {
        float[] mangSoThuc={1.2f, 2, 3, 5, 6.2f};
        System.out.println(" hien mang "+ mangSoThuc);
        float max=mangSoThuc[0];
        for (int i=1;i<mangSoThuc.length;i++){
            if(mangSoThuc[i]>max){
                max=mangSoThuc[i];
            }
        }
        float tong =0;
        for(int i =0;i<mangSoThuc.length;i++){
            tong+=mangSoThuc[i];
        }
        float tich=1;
        for(int i =0;i<mangSoThuc.length;i++){
            tich *=mangSoThuc[i];
        }
        System.out.println(" max cua mang "+max );
        System.out.println("tong mang "+ tong);
        System.out.println("tich mang "+tich);
    }
}
