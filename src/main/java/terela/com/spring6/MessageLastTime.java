package terela.com.spring6;// Created by tolik on 12.03.2017.

import java.text.DateFormat;
import java.util.Date;

public class MessageLastTime {
    Date date;
    DateFormat df;

    public MessageLastTime(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }
    public String getTimeWithMessage(String str){
        return df.format(date)+ ": "+ str;
    }
}
