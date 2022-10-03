import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binary = new ArrayDeque<>();
while (a>0){
    if(a==1){
        binary.push(a);
        break;
    }
    int residue = a%2;
    a/=2;
    binary.push(residue);


}

        for (Integer i : binary) {
            System.out.print(i);
        }
    }
}
