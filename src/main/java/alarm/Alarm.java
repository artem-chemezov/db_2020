package alarm;

import java.sql.Time;

public interface Alarm {
    void wakeUp();
    void setTime(Time time);
    void changeMusic(String song);
}
