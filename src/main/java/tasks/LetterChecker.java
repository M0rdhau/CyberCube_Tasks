package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LetterChecker {

    public static String compare(String s, String t){
        Map<Character, Integer> baseChars = stringToCharMap(s);
        Map<Character, Integer> newChars = stringToCharMap(t);
        for(char key:
                newChars.keySet()){
            if(!baseChars.containsKey(key) || baseChars.get(key) < newChars.get(key)) return "" + key;
        }
        return "";
    }

    private static Map<Character, Integer> stringToCharMap( String toExtract) {
        Map<Character, Integer> containerMap = new HashMap<>();
        for (char ch :
                toExtract.toCharArray()) {
            if (containerMap.containsKey(ch)) {
                containerMap.put(ch, containerMap.get(ch) + 1);
            }else{
                containerMap.put(ch, 1);
            }
        }
        return containerMap;
    }
}
