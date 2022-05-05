import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lineOne = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        List<String> lineTwo = (List<String>) Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        if (lineOne.size() > lineTwo.size()) {
            int n = 1;
            for (int i = 0; i < lineTwo.size(); i++) {
                lineOne.add(n, lineTwo.get(i));
                n += 2;
            }
            for (String e: lineOne) {
                System.out.print(e + " ");
        }
        }else {
            int n = 0;
            for (int i = 0; i < lineOne.size(); i++) {
                lineTwo.add(n, lineOne.get(i));
                n += 2;
            }
            for (String e: lineTwo) {
                System.out.print(e + " ");
            }
        }
    }
}