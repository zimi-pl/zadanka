package pl.zimi.zadanka.naukawlasna.IO;

import java.util.Scanner;

public class IOSave {
    public void readline() {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        int i = 0;
        while (i++ < 4) {
            s += scanner.next();
            System.out.println("echo" + s);
        }

    }
}

