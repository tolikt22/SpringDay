package terela.com.spring5;// Created by tolik on 11.03.2017.

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class WriterToFileImpl implements Writer {
    File file;
    private static final String FILE_NAME = "storage5.txt";
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
            File file = new File(FILE_NAME);
            FileUtils.write(file, "\n" + str , true);
            System.out.println("Write to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void init() throws IOException{
        this.file = new File(FILE_NAME);
        if(!file.canWrite()){
            System.out.println("Cannot write to file");
        }
    }
}
