package terela.com.spring6;// Created by tolik on 11.03.2017.

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private Writer writer;
    private Messenger messenger;

    public Application(Writer writer, Messenger messenger) {
        this.writer = writer;
        this.messenger = messenger;
        System.out.println("Application");
    }
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring6.xml");
        Application app = (Application) ctx.getBean("app6");

        for (int i = 0; i < 5; i++) {
            String message = app.messenger.getMessage();
            String stringToWrite =((MessageLastTime) ctx.getBean("messTime")).getTimeWithMessage(message);
            app.write(stringToWrite);
        }
        ctx.close();
    }
    private void write(String msg) {writer.write(msg);
    }

}
