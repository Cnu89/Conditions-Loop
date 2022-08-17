package Treemap;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
        tmap.put(101,"Srinivas");
        tmap.put(102,"Naveen");
        tmap.put(100,"Ramya");
        tmap.put(99,"Raju");
        tmap.forEach((k,v)->System.out.println(k+":"+v));

    }
}
