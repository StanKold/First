import java.util.Scanner;

public class balancedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int n=input;
        int thirdDigit= n%10;
        n/=10;
        int secondDigit=n%10;
        int firstDigit=n/10;
        while(firstDigit+thirdDigit == secondDigit){
            sum+=input;
            input=Integer.parseInt(scanner.nextLine());
n=input;
             thirdDigit= n%10;
            n/=10;
            secondDigit=n%10;
            firstDigit=n/10;

        }
        System.out.println(sum);
    }
}
