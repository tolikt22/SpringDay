package terela.com.spring2;// Created by tolik on 11.03.2017.

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class WriterToFileImpl implements Writer {
    private Date date;
    private DateFormat df;

    public WriterToFileImpl(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public void write(String str){
        try{
//            PrintWriter writer = new PrintWriter("storage3.txt", "UTF-8");
//            writer.println(date  + ": " + str);
//            writer.close();
            File file = new File("storage3.txt");
            FileUtils.write(file, "\n"+df.format(date) + ": " + str + "\n", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
