package terela.com.spring6;// Created by tolik on 11.03.2017.

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class WriterToFileImpl implements Writer {
    File file;
    private static final String FILE_NAME = "storage6.txt";
    private Date date;
    private DateFormat df;

    public WriterToFileImpl(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public void write(String str){
        try{
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
