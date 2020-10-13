package TemaThreads;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("introduceti cuvantul cautat:");
      String cuvant = scan.nextLine();
        String dir="C:/Thread";
        File directoryPath = new File(dir);
        //List of all files and directories
        String contents[] = directoryPath.list();
        for(int i=0; i<contents.length; i++) {
            new SearchWord(dir+"/"+contents[i],cuvant).start();

        }
    }

}
