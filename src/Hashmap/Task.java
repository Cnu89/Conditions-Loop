package Hashmap;

import java.util.HashMap;

public class Task {
    public static void main(String args[])
    {
        String str = "Australia";
        //HashMap char as a key and occurrence as a value
        HashMap<Character,Integer> charCount = new HashMap<>();
        for (int i=0; i<=str.length()-1; i++) {
            if(charCount.containsKey(str.charAt(i))) {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            }
            else {
                charCount.put(str.charAt(i),1);
            }
        }
        System.out.println(charCount);
    }
}
