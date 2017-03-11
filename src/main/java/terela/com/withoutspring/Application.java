package terela.com.withoutspring.co.withoutspring;// Created by tolik on 11.03.2017.

import java.util.Date;

public class Application {
    private WriterToFile writer;
    private Messenger messenger;

    public static void main(String[] args) {
        Application app = new Application();
        app.messenger = new Messenger();
        app.writer = new WriterToFile();

        String message = app.messenger.getMessage();
        app.write(message);
    }

    private void write(String msg){
        writer.write(new Date() +": "+msg);
    }

}
