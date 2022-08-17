package ExpectionHandling;

public class Expection {
    public static void main(String[] args) {
        int[] a=new int[3];
        a[0]=1;
        try {
            a[4]=10;
        }
       catch (Exception e){
            System.out.println(e);
       }
        System.out.println(a[0]);
    }
}
