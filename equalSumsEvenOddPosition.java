import java.util.Scanner;

public class equalSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int a = Integer.parseInt(scanner.nextLine());
int b = Integer.parseInt(scanner.nextLine());

for(int i = a; i<=b;i++){
    int actual = i;
    int odds = 0;
    int evens =0;
    for(int k=6; k>0;k--){
        if (k %2 != 0){
             odds += actual%10;
            actual/=10;
        }else if (k %2 == 0){
            evens += actual%10;
            actual/=10;
        }
    }
        if (odds == evens){
            System.out.print(i+" ");
            odds =0; evens=0;
        }else {
            odds =0; evens=0;
        }
    }

    }
}
