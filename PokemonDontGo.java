import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> Line  = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //System.out.println(Line);
        int sum = 0;
        int index = Integer.parseInt(scanner.nextLine());
        while(!Line.isEmpty()){
            int removed=0;
            if(index<0){
                removed+=Line.get(0);
                sum+=removed;
                Line.set(0, Line.get(Line.size()-1));
            }else if(index > Line.size()-1){
                removed+=Line.get(Line.size()-1);
                sum+=removed;
                Line.set(Line.size()-1, Line.get(0));
            }else{
                removed+=Line.get(index);
                sum+=removed;
                Line.remove(index);
            }
            for(int i =0; i<Line.size();i++){
                if(Line.get(i)<=removed){
                    Line.set(i, Line.get(i)+removed);
                }else{
                    Line.set(i, Line.get(i)-removed);
                }
            }
            //System.out.println(sum+"actualSum"+Line+"actualLine");
            if(Line.isEmpty()){
                break;
            }
            index=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }

}
