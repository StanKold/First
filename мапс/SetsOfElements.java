import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] line = scanner.nextLine().split("\\s+");
        int m = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        Set<Integer>setM = new LinkedHashSet<>();
        Set<Integer>setN = new LinkedHashSet<>();
        for (int i = 0; i < m; i++) {
            setM.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < n; i++) {
            setN.add(Integer.parseInt(scanner.nextLine()));
        }
        for (Integer integer : setM) {
            if(setN.contains(integer)){
                System.out.print(integer+" ");
            }
        }








    }
}
