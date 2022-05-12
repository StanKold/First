import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



public class countCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]input = Arrays.stream((scanner.nextLine().split(" "))).toArray(String[]::new);
        Map<Character , Integer>counted=new LinkedHashMap<>();
for  (String s : input) {
           char[]simbols = s.toCharArray();
for (char simbol : simbols) {
        counted.putIfAbsent(simbol,0);
        counted.put(simbol,counted.get(simbol)+1);
    }
}
for(Map.Entry<Character, Integer> entry : counted.entrySet() )
        System.out.println(entry.getKey()+" -> "+entry.getValue());
    }
}
