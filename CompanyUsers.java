import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String,String>>employes = new LinkedHashMap<>();
        while(!input.equals("End")){
            String [] comand = input.split(" -> ");
            employes.putIfAbsent(comand[0],new LinkedHashMap<>());
            employes.get(comand[0]).put((comand[1]),comand[0]);
            input= scanner.nextLine();
     }
       for(Map.Entry<String,Map<String,String>> e: employes.entrySet()){
           System.out.println(e.getKey());
           for(Map.Entry<String,String> z: e.getValue().entrySet()){
               System.out.println("-- "+z.getKey());
           }
      }
    }
}
