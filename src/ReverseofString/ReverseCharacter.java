package ReverseofString;

public class ReverseCharacter {
    //Reverse Character of String

    public static void main(String[] args) {
        String input = "Srinivas";
        String output = "";
        char[] ch = input.toCharArray();
        for ( int i = 0; i <= ch.length - 1; i++) {
            output = ch[i] + output;
        }
        System.out.println(output);
    }
}
