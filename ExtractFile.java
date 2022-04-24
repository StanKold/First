import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char split = 92;
        int start = input.lastIndexOf(split);
                int end = input.lastIndexOf('.');
        System.out.println("File name: "+input.substring(start+1,end));
        System.out.println("File extension: "+input.substring(end+1,input.length()));


    }
}
