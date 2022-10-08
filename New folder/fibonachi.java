import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long[] num = new long[n + 1];
        if (n >= 25) {
            for (int i = 25; i <= n; i++) {
                num[23] = 28657;
                num[24] = 46368;
                num[i] = num[i - 1] + num[i - 2];
            }
        } else if (n >= 15) {
            for (int i = 15; i <= n; i++) {
                num[13] = 233;
                num[14] = 377;
                num[i] = num[i - 1] + num[i - 2];
            }
        } else if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                num[0] = 0;
                num[1] = 1;
                num[i] = num[i - 1] + num[i - 2];
            }
        }else{
            if(n==1){
                num[n]=1;
            }else{
num[n]=0;
            }

        }
        System.out.println(num[n]);
    }
}

