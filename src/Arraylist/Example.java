package Arraylist;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();

        // Retrieving size of an array
        System.out.println(obj.size());

        // Adding elements in to arraylist
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add("Srinivas");
        System.out.println(obj);

        //Retrieving elements in to the arraylist
        System.out.println(obj.get(0));

        //print all the elements in the arraylist
        for(int i=0; i<=obj.size()-1; i++){
            System.out.println(obj.get(i));
        }

        //print all the elements using foreach loop
        for (Object e:obj){
            System.out.println(e);
        }

        // generic collections
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(40);
        System.out.println(a);

        // Example trail
        ArrayList<String> Linknames=new ArrayList<String>();
        Linknames.add("Sinivas");
        Linknames.add("Naveen");
        Linknames.add("Ramya");
        Linknames.add("careerbridge");

        //contains
        System.out.println(Linknames.contains("careerbridge"));

        int count=Linknames.size();
        for (int i=0; i<=count-1; i++){
            System.out.println(Linknames.get(i));
            if (Linknames.get(i)=="Ramya"){
                System.out.println("Click operation");
                break;
            }
        }

    }
}
