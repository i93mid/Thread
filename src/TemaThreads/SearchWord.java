package TemaThreads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchWord extends Thread {
    String path;
    String word;
    public SearchWord(String path, String word) {
        this.path = path;
        this.word = word;
    }

    public void run(){

        try {
            Scanner scanner = new Scanner(new File(this.path));
            int count = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int pos = line.indexOf(word);
                     pos >= 0;
                     pos = line.indexOf(word, pos + 1))
                    count++;
            }
            scanner.close();
            System.out.println("Fisier :"+this.path+" are "+count+" aparitii "+word);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
