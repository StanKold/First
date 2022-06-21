import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringPath {
    public static void main(String[] args) throws IOException {
        String inPath = "C:\\Users\\Big\\IdeaProjects\\FilesAndStreams\\src";


        File folder = new File(inPath);
        File[] allFiles = folder.listFiles();

        for (File f : allFiles) {
            if (f.isFile()) {
                System.out.println(f);
            } else {
                File[] inf = f.listFiles();
                for (File x : inf) {
                    System.out.println(x);
                }

            }


        }
    }
}

