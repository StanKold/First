import java.util.*;
import java.util.stream.Collectors;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> line = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while(scanner.hasNextLine()){
            String input= scanner.nextLine();
            if (input.equals("")){
                break;
            }
            List<String> line2 = Arrays.stream(input.split(" ")).collect(Collectors.toList());
                for (String e: line2)
                {line.add(e);}
                line2= new ArrayList<>();
            }
        int value =0;
        String input ="";
        String winner = "no";
        Map<String, Integer> resources = new LinkedHashMap<>();
        resources.put("shards",0);
        resources.put("fragments",0);
        resources.put("motes",0);
            for(int i=0; i< line.size()-1;i+=2) {
                value = Integer.parseInt(line.get(i));
                input = line.get(i + 1).toLowerCase();

                resources.putIfAbsent(input, 0);
                resources.put(input, resources.get(input) + value);
                if (input.equals("shards") || input.equals("fragments") || input.equals("motes")) {
                    if (resources.get(input) >= 250) {
                        resources.put(input, resources.get(input) - 250);
                        winner = input;
                        break;
                    }
                }
            }
        switch (winner) {
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }
            if(!winner.equals("no")) {
                for (Map.Entry<String, Integer> result : resources.entrySet()) {
                    System.out.println(result.getKey() + ": " + result.getValue());
                }
            }
    }


}
