package kg.charginov.date.service.impl;

import kg.charginov.date.model.Date;
import kg.charginov.date.service.DateService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class DateServiceImpl implements DateService {

    @Override
    public Date now(){
        LocalDateTime dateTime = LocalDateTime.now();
        return new Date(dateTime.getHour(),dateTime.getMinute(),dateTime.getSecond());
    }

    @Override
    public Date changeDate(Date date,int hour,int minute,int second) throws ParseException {

        String initDate = date.getHour()+":"+date.getMinute()+":"+date.getSecond();
        System.out.println(initDate);
        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        java.util.Date date2 = sdf.parse(initDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date2);

        cal.add(Calendar.HOUR_OF_DAY, hour);
        cal.add(Calendar.MINUTE, minute);
        cal.add(Calendar.SECOND,second);

        date2 = cal.getTime();

        return new Date(date2.getHours(),date2.getMinutes(),date2.getSeconds());
    }
}