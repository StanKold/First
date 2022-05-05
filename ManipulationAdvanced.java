import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while(!input.equals("end")){
            List <String> line = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            switch(line.get(0)){
                case "Contains":
                    boolean contained = false;
                   for(int i =0; i< nums.size();i++){
                       if (nums.get(i)==Integer.parseInt(line.get(1))){
                           System.out.println("Yes");
                           contained = true;
                           i= nums.size();
                       }}
                       if (!contained){System.out.println("No such number");}
                       break;
                case "Print":
                    switch(line.get(1)){
                        case "even":
                            for(int i =0; i < nums.size();i++){
                                if(nums.get(i)%2 == 0 && nums.get(i)!=0){
                                    System.out.print(nums.get(i)+" ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for(int i =0; i < nums.size();i++){
                                if(nums.get(i)%2 != 0 && nums.get(i)!=0){
                                    System.out.print(nums.get(i)+" ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                    case"Get":
                     if(line.get(1).equals("sum")){
                        int sum = 0;
                        for(int i = 0; i< nums.size(); i++){
                            sum += nums.get(i);
                        }
                         System.out.println(sum);
                     }
                    break;
                case"Filter":
                    switch(line.get(1)){
                        case"<":
                            int n = Integer.parseInt(line.get(2));
                            for(int i = 0; i < nums.size(); i++){
                                if(nums.get(i)<n){
                                    System.out.print(nums.get(i)+" ");
                                }
                            }

                            break;
                        case">":
                            n = Integer.parseInt(line.get(2));
                            for(int i = 0; i < nums.size(); i++){
                                if(nums.get(i) > n){
                                    System.out.print(nums.get(i)+" ");
                                }
                            }
                            break;
                        case">=":
                             n = Integer.parseInt(line.get(2));
                            for(int i = 0; i < nums.size(); i++){
                                if(nums.get(i) >= n){
                                    System.out.print(nums.get(i)+" ");
                                }
                            }
                            break;
                        case"<=":
                            n = Integer.parseInt(line.get(2));
                            for(int i = 0; i < nums.size(); i++){
                                if(nums.get(i) <= n){
                                    System.out.print(nums.get(i)+" ");
                                }
                            }
                            break;

                        }
                    System.out.println();
                    break;

            }
            input = sc.nextLine();
        }
    }
}
