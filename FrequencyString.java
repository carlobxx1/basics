package TwentySix;

import java.util.HashMap;
import java.util.Map;

public class FrequencyString {
    public static void main(String[] args) {
        String s="shivam has exam";
     int h = s.length();
        HashMap<Character,Integer>result=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if (result.containsKey(s.charAt(i))){
                result.put(s.charAt(i), result.get(s.charAt(i))+1);
            }
            else {
               result.put(s.charAt(i) , 1);
            }
        }
        for(Map.Entry<Character,Integer> j:result.entrySet()){
            System.out.println(j.getKey()+" "+j.getValue());
        }
    }
}
