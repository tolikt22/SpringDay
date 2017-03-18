package terela.com.spring3;// Created by tolik on 11.03.2017.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Application {
    private Writer writer;
    private Messenger messenger;


    public Application(Writer writer, Messenger messenger) {
        this.writer = writer;
        this.messenger = messenger;
        System.out.println("Application");

    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring3.xml");
        Thread.sleep(2000);
        Application app = (Application) ctx.getBean("app3");

        for (int i = 0; i < 3; i++) {
            String message = app.messenger.getMessage();
            app.write(message);
        }
    }

    private void write(String msg) {
        writer.write(new Date() + ": " + msg);
    }

}
