package BreakCondition;

public class BreakExample {
    public static void main(String[] args) {
        String [] names={"Cnu","Raju","Sravani","Ramya"};
        for (int i=0; i<=names.length-1;i++){
            System.out.println(names[i]);
            if (names[i].equals("Raju")){
                System.out.println("Raju is available");
                break;
            }
            }

        }
    }
