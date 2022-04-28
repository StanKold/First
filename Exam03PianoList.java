import java.util.*;

public class Exam03PianoList {
    public static class Pianolist{

        String composer;
        String key;



        public String getComposer() {
            return composer;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Pianolist( String composer, String key) {

            this.composer = composer;
            this.key = key;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Pianolist> songs = new LinkedHashMap<>();
        for(int i=0; i<n; i++){
           String [] input= scanner.nextLine().split("[|]");
           String name = input[0]; String composer = input[1];String key = input[2];
           songs.put(name, new Pianolist(composer,key));
        }

        String comand = scanner.nextLine();
        while(!comand.equals("Stop")){
            String [] comands = comand.split("[|]");
            switch(comands[0]){
                case"Add":
                    String name = comands[1]; String composer = comands[2];String key = comands[3];
                    if( songs.containsKey(name)) {

                        System.out.printf("%s is already in the collection!\n",name);
                    }else{
                        songs.put(name, new Pianolist(composer, key));
                        System.out.printf("%s by %s in %s added to the collection!\n", name, composer, key);
                    }
                    break;
                case"Remove":
                    String remove = comands[1];
                    if( songs.containsKey(remove)){
                    songs.remove(remove);
                    System.out.printf("Successfully removed %s!\n",remove);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",remove);
                    }
                    break;
                case"ChangeKey":

                    String change = comands[1]; String changeKey = comands[2];
                    if( songs.containsKey(change)){
                        songs.get(change).setKey(changeKey);
                        System.out.printf("Changed the key of %s to %s!\n",change,changeKey);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",change);
                    }

                    break;
            }
comand= scanner.nextLine();
        }
        for(Map.Entry<String, Pianolist> e: songs.entrySet()) {
            System.out.println(e.getKey()+" -> Composer: "+e.getValue().getComposer()+", Key: "+e.getValue().getKey());
        }
    }
}
