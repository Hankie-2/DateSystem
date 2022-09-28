package kg.charginov.date.service;

import kg.charginov.date.model.Date;

import java.text.ParseException;

public interface DateService {

    public Date now();

    public Date changeDate(Date date,int hour,int minute,int second) throws ParseException;

}
