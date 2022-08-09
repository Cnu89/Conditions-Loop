package OrderofArray;

public class Ascending {
    public static void main(String[] args) {
        int[] a = {10, 3, 5, 11, 20, 18, 9};
        int temp;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        for (int k = 0; k <= a.length - 1; k++){
            System.out.println(a[k]);

        }
        System.out.println("Second highest element is"+a[a.length-2]);
        System.out.println("Second smallest element is"+a[1]);

    }
}
