import java.util.Scanner;

public class cominations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int count = 1 ;
        boolean combination = true;
        for(int i = a; i<=b;i++){
            for(int k =a; k<=b; k++){
                if(i+k==n) {
                    System.out.println("Combination N:"+count+ " ("+i+ " + " +k+ " = "+n+")");
                 i=b;
                 combination = false;
                }

                count++;
            }
        }
if (combination){
    System.out.printf("%d combinations - neither equals %d",count-1 ,n);
}





    }
}
