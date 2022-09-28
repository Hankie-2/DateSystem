package kg.charginov.date;

import kg.charginov.date.model.Date;
import kg.charginov.date.service.DateService;
import kg.charginov.date.service.impl.DateServiceImpl;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        DateService service = new DateServiceImpl();

        date.setHour(2);
        date.setMinute(33);
        date.setSecond(24);

        Date newDate = service.changeDate(date,12,22,22);

        System.out.println(newDate);
    }
}
