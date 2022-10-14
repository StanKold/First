import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer > countNumbers = new LinkedHashMap<>();
        for (int i = 0; i < line.length; i++) {
         countNumbers.putIfAbsent(line[i],0);
         countNumbers.put(line[i], countNumbers.get(line[i])+1);

        }

for(Map.Entry<Double,Integer> entry : countNumbers.entrySet()){
    System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue() );
}
    }
}
