package ge.edu.btu;

import ge.edu.btu.utils.CountThread;
import ge.edu.btu.utils.FinderThread;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\User\\IdeaProjects\\irakli_giorgadze_v2\\BTU_DOCUMENT");
        File[] files = file.listFiles();
        CountThread countThread;
        FinderThread finderThread;
        try {
            while(true){
                countThread = new CountThread();
                finderThread = new FinderThread(files);
                countThread.start();
                finderThread.start();
                countThread.join();
                finderThread.join();

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}