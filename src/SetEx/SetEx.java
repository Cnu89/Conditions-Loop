package SetEx;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> data=new LinkedHashSet<Integer>();
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(10);
        System.out.println(data);

       //Retrieving values from the set
        Iterator newdata=data.iterator();
        while (newdata.hasNext()){
            System.out.println(newdata.next());
        }

    }
}
