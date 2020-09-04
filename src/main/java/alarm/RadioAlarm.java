package alarm;

import lombok.Data;

import java.sql.Time;
@Data
public class RadioAlarm{
    private Alarm alarm;
    private Radio radio;

    public void wakeUp(){
        alarm.wakeUp();
    }

    public void setTime(Time time){
        alarm.setTime(time);
    }

    public void changeMusic(String song){
        alarm.changeMusic(song);
    }

    public void increaseVolume(){
        radio.increaseVolume();
    }

    public void decreaseVolume(){
        radio.increaseVolume();
    }

    public void somethingRadioElse(){
        radio.somethingRadioElse();
    }
}
