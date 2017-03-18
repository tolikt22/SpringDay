package terela.com.spring5;// Created by tolik on 11.03.2017.

import java.util.Scanner;

public class MessengerImpl implements Messenger {
    public String getMessage(){
        System.out.println("Input your message");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
