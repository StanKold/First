import java.util.Scanner;

public class MilitaryTanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] line = scanner.nextLine().split("");
        int[]coordinates =new int[]{0, 0};
        for (int i = 0; i < line.length; i++) {
            switch (line[i]){
                case "R":
                    coordinates[0]= coordinates[0]+1;
                    break;
                case "L":
                    coordinates[0]= coordinates[0]-1;
                    break;
                case "D":
                    coordinates[1]= coordinates[1]-1;
                    break;
                case "U":
                    coordinates[1]= coordinates[1]+1;
                    break;


            }

        }
        System.out.println("("+coordinates[0]+", "+coordinates[1]+")");
    }
}
