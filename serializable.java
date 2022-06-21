import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class serializable {

    public static void main(String[] args) {

        String path = "C:\\Users\\Big\\IdeaProjects\\FilesAndStreams\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        Scanner scanner = new Scanner(System.in);


Cube cube = new Cube();
cube.colour = "green";
cube.width = 15.3d;
cube.height = 12.4d;
cube.depth = 3d;

try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
    oos.writeObject(cube);


}catch(IOException e){
    System.out.println("Preebafka");
}







    }
}
