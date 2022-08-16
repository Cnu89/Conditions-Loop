package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("Srinivas",100);
        obj.put("Naveen",200);
        obj.put("Raju",300);
        obj.put(null,400);
        obj.put(null,500);
        obj.put("careerbridge",null);
        obj.put("careerbridge1",null);
        obj.put("careerbridge",500);
        System.out.println(obj);

        //Retrieving the values from hashmap
        System.out.println(obj.get("Srinivas"));

        //foreach
        obj.forEach((k,v)->System.out.println(k+":"+v));

        //Entryset
        for (Map.Entry m:obj.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
        //Containskey
        System.out.println(obj.containsKey("Naveen"));

        //Replace
        obj.replace("Srinivas",700);
        System.out.println(obj);

        //Remove
        obj.remove("careerbridge1");
        System.out.println(obj);
    }

}
