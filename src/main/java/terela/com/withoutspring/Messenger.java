package terela.com.withoutspring;// Created by tolik on 11.03.2017.

import java.util.Scanner;

public class Messenger {

    public String getMessage(){
        System.out.println("Input your message");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
