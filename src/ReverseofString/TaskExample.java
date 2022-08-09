package ReverseofString;

public class TaskExample {
    public static void main(String[] args) {
        String input = "I love my country";
        String output = "";
        String[] splittedstring = input.split(" ");
        for (int i = 0; i <= splittedstring.length - 1; i++) {
            output=splittedstring[i]+" "+output;


        }String output1="";
        char[] ch=output.toCharArray();
        for (int i=0; i<=ch.length-1; i++){
            output1=ch[i]+output1;

        } System.out.println(output1);

    }
}
