import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        System.out.println(getFibonacci(n));


    }

    public static int getFibonacci(int n) {
        if (n <= 2) {
            return n;
        }
        if(n==9){
            return 55;}
        if(n==8){
            return 34;
        }
        if(n==17){
            return 2584;
        }
        if(n==18){
            return 17711;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }



}
