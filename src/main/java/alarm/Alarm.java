package alarm;

import java.sql.Time;

public class Alarm extends RadioAlarm {
    private String song;

    @Override
    public void wakeUp() {
        System.out.println("wake up!!");
    }

    @Override
    public void setTime(Time time) {
        this.setTime(time);
    }

    @Override
    public void changeMusic(String song) {
        this.song = song;
    }
}
