import java.util.*;

public class AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>>grades = new TreeMap<>();
for (int i = 0; i < n; i++) {
    String [] line = scanner.nextLine().split(" ");
    double grade = Double.parseDouble(line[1]);
      grades.putIfAbsent(line[0],new ArrayList<>());
      grades.get(line[0]).add(grade);
    }

        for (Map.Entry<String , List<Double>> entry: grades.entrySet()) {

            System.out.print(entry.getKey()+" -> ");
            double average =0.00;
            List <Double> actual = entry.getValue();
            for (Double d : actual) {
                System.out.printf("%.2f ",d);
                average+=d;
            }
            System.out.printf("(avg: %.2f)%n",average/actual.size());
        }





    }
}
