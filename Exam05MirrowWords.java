import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam05MirrowWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "([@|#])(?<word1>[A-Za-z+]{3,})(\\1){2,}(?<word2>[A-Za-z+]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int MatchCounter =0;
        int MirrorCounter=0;
        List<String> mirrors = new ArrayList<>();
        while(matcher.find()){
            MatchCounter++;
            String streight = matcher.group("word2");
            String reversed="";
            for(int i=streight.length()-1; i>=0; i--){
           reversed += streight.charAt(i);
            }
            if(matcher.group("word1").equals(reversed)) {
                MirrorCounter++;
                mirrors.add(matcher.group("word1") + " <=> " + matcher.group("word2"));
            }
        }
        if(MatchCounter==0) {
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!\n",MatchCounter);}

            if(MirrorCounter==0){
                System.out.println("No mirror words!");
            }else{
                System.out.println("The mirror words are:");
                for(int i =0; i < MirrorCounter;i++){
                    if(i>0){
                        System.out.print(", ");
                    }
                    System.out.print(mirrors.get(i));

            }


        }






    }
}
