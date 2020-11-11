package ge.edu.btu.utils;

import java.io.File;

public class CountThread extends Thread {
    File file = new File("C:\\Users\\User\\IdeaProjects\\irakli_giorgadze_v2\\BTU_DOCUMENT");
    public CountThread(){
    }

    @Override
    public void run() {
        while(true) {
            int count = 0;
            try {
                File[] files = file.listFiles();
                for(File file1 : files){
                    count++;
                }
                System.out.println(count);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}