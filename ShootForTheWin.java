import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] target = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count=0;
        String input = scanner.nextLine();
        while (!input.equals("End")){
            int shoot = Integer.parseInt(input);

            if(shoot <0 || shoot >=target.length){

                input= scanner.nextLine();
                continue;
            }
            if(target[shoot] == -1){

                input= scanner.nextLine();
                continue;
            }else {
                count ++;
                int points=target[shoot];
                target[shoot] = -1;

                for(int i =0; i< target.length; i++){
                    if(target[i] !=-1){
                        if(target[i]<=points){
                            target[i]+=points;
                        }else {
                            target[i] -= points;
                        }
                    }
                }

            }



         input= scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",count);
for(int e : target) {
    System.out.print(e+" ");
}
    }


}
