import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        //парола съвпада с фразата s3cr3t!P@ssw0rd. При съвпадение да се изведе &quot;Welcome&quot;. При несъвпадение
        //да се изведе &quot;Wrong password!&quot;.
        if (pass.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
