public class donguyento {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        int dem=0;
        for(int i=2;dem<20;i++){
            boolean soNT =true;
            for (int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    soNT=false;
                    break;
                }
            }
            if(soNT){
                System.out.println(i+"");
                dem++;
            }
        }

    }
}
