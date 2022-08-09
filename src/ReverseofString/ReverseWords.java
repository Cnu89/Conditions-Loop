package ReverseofString;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "I love my country";
        String output = "";
        String[] splittedstring = input.split(" ");
        for (int i = 0; i <= splittedstring.length - 1; i++) {
            output=splittedstring[i]+" "+output;

        } System.out.println(output);

    }
}