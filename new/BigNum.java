import java.math.BigInteger;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger sum = new BigInteger("1");
        for (int i = 1; i <= a.intValue(); i++) {
            BigInteger b = BigInteger.valueOf(i);
            sum = sum.multiply(b);
        }
        System.out.println(sum);
    }
}
