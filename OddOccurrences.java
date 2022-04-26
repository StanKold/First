import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = List.of(scanner.nextLine().toLowerCase().split(" "));
        Map<String , Integer > occure = new LinkedHashMap<>();
        for (String s : input) {
            occure.putIfAbsent(s,0);
            occure.put(s, occure.get(s)+1);
        }
        int count = 0;
for(Map.Entry<String, Integer> entry : occure.entrySet()){

    if( entry.getValue() %2 != 0){
        if(count > 0){
            System.out.print(", ");
        }
        System.out.print(entry.getKey());
        count++;
    }
}

    }
}
