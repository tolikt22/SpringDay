package terela.com.withoutspring;// Created by tolik on 11.03.2017.

import java.io.IOException;
import java.io.PrintWriter;

public class WriterToFile {
    public void write(String str){
        try{
            PrintWriter writer = new PrintWriter("storage2.txt", "UTF-8");
            writer.println(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
