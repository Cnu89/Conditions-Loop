package ElseifCondition;

public class Elseif {
    public static void main(String[] args) {
        int marks = 100;
       if (marks < 35) {
            System.out.println("fail");
        }
       else if (marks >= 60 && marks <= 100) {
            System.out.println("first class");
        }
       else if (marks >= 45 && marks <= 59) {
            System.out.println("Second class");
        }
       else if (marks >= 36 && marks <= 44) {
            System.out.println("third class");
        }
       else {
            System.out.println("Invalid");

        }
    }
}