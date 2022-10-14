import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String>list = new LinkedHashSet<>();
while(!input.equals("END")){
    String [] comands = input.split(", ");
    switch(comands[0]){
        case"IN":
            list.add(comands[1]);
            break;
        case"OUT":
            list.remove(comands[1]);
            break;

    }
  input= scanner.nextLine();
}
if(list.isEmpty()){
    System.out.println("Parking Lot is Empty");
}
        for (String s : list) {
            System.out.println(s);
        }

    }
}
