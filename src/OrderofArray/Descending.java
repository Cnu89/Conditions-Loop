package OrderofArray;

public class Descending {
    public static void main(String[] args) {
        int[] a={10,3,5,11,20,18,9};
        int temp;
        for (int i=0; i<=a.length-1; i++){
            for (int j=i+1; j<=a.length-1; j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int l=a.length-1; l>=0; l--){
            System.out.println(a[l]);
        }
    }
}
