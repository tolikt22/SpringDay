package terela.com.spring;// Created by tolik on 11.03.2017.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Application {
    private Writer writer;
    private Messenger messenger;

    public Application(Writer writer, Messenger messenger) {
        this.writer = writer;
        this.messenger = messenger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Application app = (Application) ctx.getBean("app");

        String message = app.messenger.getMessage();
        app.write(message);
    }

    private void write(String msg){
        writer.write(new Date() +": "+msg);
    }

}
