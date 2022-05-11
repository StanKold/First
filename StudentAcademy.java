import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String , List<Double>> grade = new LinkedHashMap<>();
        for(int i =0;i<n;i++){
            String name = scanner.nextLine();
            double score = Double.parseDouble(scanner.nextLine());
            grade.putIfAbsent(name,new ArrayList<Double>());
           grade.get(name).add(score);
        }
for(Map.Entry<String,List<Double>> e : grade.entrySet()){
    double sum = 0.0;
    for (int i=0; i< e.getValue().size(); i++) {
        sum += e.getValue().get(i);
    }
     sum= sum/e.getValue().size();
    if(sum>=4.5) {
        System.out.printf("%s -> %.2f%n", e.getKey(), sum);

    }
}

    }
}
