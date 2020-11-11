package ge.edu.btu.utils;

import java.io.File;
import java.util.Scanner;

public class FinderThread extends Thread {
    Scanner scanner = new Scanner(System.in);
    File[] files;

    public FinderThread(File[] files){
        this.files = files;
    }
    @Override
    public void run() {
        while(true) {
            System.out.println("შემოიტანე საძიებო სიტყვა");
            String word = scanner.nextLine();
            for(File file1 : files){
                if(file1.getName().contains(word)){
                    System.out.println("ფაილი ნაპოვნია " + file1.getName());
                }
            }
        }
    }
}