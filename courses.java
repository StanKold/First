import java.util.*;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> coursesList = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String[] comand = input.split(" : ");
            String kay = comand[0];
            String name = comand[1];
            if (coursesList.containsKey(kay)) {
                coursesList.get(kay).add(name);
            } else {
                coursesList.put(kay, new ArrayList<String>());
                coursesList.get(kay).add(name);
            }
           input = scanner.nextLine();
        }
for(Map.Entry<String,List<String>> e: coursesList.entrySet()){
    System.out.println(e.getKey()+": "+e.getValue().size());
    for(int i =0; i<e.getValue().size(); i++)
    System.out.println("-- "+e.getValue().get(i));

}

    }
}
