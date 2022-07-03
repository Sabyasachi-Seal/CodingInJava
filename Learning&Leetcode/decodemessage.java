import java.util.*;
public class decodemessage {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();
        char ch = 'a';
        for (int i = 0; i < key.length(); i++) {
            if(key.charAt(i) != ' '){ 
                if(!hm.containsKey(key.charAt(i))){
                    hm.put(key.charAt(i), (char)(ch));
                    ch++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' ') sb.append(message.charAt(i));
            else sb.append(hm.get(message.charAt(i)));
        }
        return sb.toString();
    }
}
