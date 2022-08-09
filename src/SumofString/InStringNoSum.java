package SumofString;

public class InStringNoSum {
    public static void main(String[] args) {
        String input="sri12ni34vas56";
        int sum=0;
        char[] ch=input.toCharArray();
        for (int i=0; i<=ch.length-1; i++){
            if (Character.isDigit(ch[i])){
                char ch1=ch[i];
                int no=Character.getNumericValue(ch1);
                sum=sum+no;
            }
        }
        System.out.println(sum);
    }
}
