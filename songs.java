import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {

    public static class SongList {
        String typeLit;
        String name;
        String time;

        public String getTypeLit() {
            return typeLit;
        }

        public void setTypeLit(String typeLit) {
            this.typeLit = typeLit;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List <SongList> songs = new ArrayList();
        for (int i = 1; i <= n; i++) {
            String[] next = scanner.nextLine().split("_");

            SongList song = new SongList();
            song.setTypeLit(next[0]);
            song.setName(next[1]);
            song.setTime(next[2]);

songs.add(song);

        }
        String comand = scanner.nextLine();
        if (comand.equals("all")){
            for(SongList song : songs){
                System.out.println(song.getName());
            }
        }else{
            for(SongList song : songs){
                if( song.getTypeLit().equals(comand)){

                    System.out.println(song.getName());
                }
            }
        }



    }
}
