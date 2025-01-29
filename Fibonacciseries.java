public class Fibonacciseries {
    public static void printFibonacciseries(int m){
        int t1=0;
        int t2=1;
        System.out.println(t1+""+t2);
        for(int i=3;i<=m;i++){
            int nextterm=t1+t2;
            System.out.println(""+ nextterm);
            t1=t2;
            t2=nextterm;
        }
    }
    
}
