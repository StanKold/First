import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> powerOfCards = new HashMap<>();
        powerOfCards.put("1",1);
        powerOfCards.put("2",2);
        powerOfCards.put("3",3);
        powerOfCards.put("4",4);
        powerOfCards.put("5",5);
        powerOfCards.put("6",6);
        powerOfCards.put("7",7);
        powerOfCards.put("8",8);
        powerOfCards.put("9",9);
        powerOfCards.put("J",11);
        powerOfCards.put("Q",12);
        powerOfCards.put("K",13);
        powerOfCards.put("A",14);
        powerOfCards.put("S",4);
        powerOfCards.put("H",3);
        powerOfCards.put("D",2);
        powerOfCards.put("C",1);

        Map<String, Set<String>>playersCards =new LinkedHashMap<>();
String input = scanner.nextLine();
while (!input.equals("JOKER")){
    String [] line = input.split(": ");
    String playerName =line[0];
    String [] playerCards =line[1].split(", ");
    playersCards.putIfAbsent(playerName, new HashSet<>());
    for (int i = 0; i <playerCards.length; i++) {
        playersCards.get(playerName).add(playerCards[i]);
    }
   input= scanner.nextLine();
}
        for (Map.Entry<String, Set<String>> e : playersCards.entrySet()) {
            String name = e.getKey();
            int power = 0;
            for (String powers : e.getValue()) {
                String [] powwers = powers.split("");
                if(powers.startsWith("10")){
                    power += 10*powerOfCards.get(powwers[2]);
                }else {
                   power += powerOfCards.get(powwers[0])*powerOfCards.get(powwers[1]);
                }
            }
            System.out.println(name+": "+power);
        }

    }
}
