package HashMap;

import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        String str="Rohan Varshney";
        HashMap<Character,Integer> fmap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(fmap.containsKey(ch)){
                fmap.put(ch,fmap.get(ch)+1);
            }
            else{
                fmap.put(ch,1);
            }
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
              fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
        }
    }
}
