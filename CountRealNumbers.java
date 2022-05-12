import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
String[] inputs = input.split(" ");
        Map<String, Integer> nums = new TreeMap<>();
     for(String e: inputs){
         nums.putIfAbsent(e,0);
         nums.put(e,nums.get(e)+1 );
     }
     for(Map.Entry<String,Integer> entry : nums.entrySet()) {
         System.out.println(entry.getKey()+ " -> "+entry.getValue());
     }
    }
}
