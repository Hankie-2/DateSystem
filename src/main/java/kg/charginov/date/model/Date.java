package kg.charginov.date.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.PositiveOrZero;

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Date {

    @PositiveOrZero(message = "Значение не должно быть отрицательным")
    Integer hour;

    @PositiveOrZero(message = "Значение не должно быть отрицательным")
    Integer minute;

    @PositiveOrZero(message = "Значение не должно быть отрицательным")
    Integer second;

    public Date(Integer hour, Integer minute, Integer second) {
        if(hour>24){
            throw new IllegalArgumentException("Часы не могут быть больше 24");
        }
        if(minute>60){
            throw new IllegalArgumentException("Минуты не могут быть больше 60");
        }
        if(second>60){
            throw new IllegalArgumentException("Секунды не могут быть больше 60");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        if(hour>24){
            throw new IllegalArgumentException("Часы не могут быть больше 24");
        }
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        if(minute>60){
            throw new IllegalArgumentException("Минуты не могут быть больше 60");
        }
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        if(second>60){
            throw new IllegalArgumentException("Секунды не могут быть больше 60");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return "Date{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
