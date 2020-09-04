package alarm;

import lombok.Data;

import java.sql.Time;
@Data
public class RadioAlarm implements Alarm, Radio{
    private String song;
    private int volume;
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

    @Override
    public void increaseVolume() {
        this.setVolume(this.getVolume() + 1);
    }

    @Override
    public void decreaseVolume() {
        this.setVolume(this.getVolume() - 1);
    }

    @Override
    public void somethingRadioElse() {
        System.out.println("something else");
    }
}
