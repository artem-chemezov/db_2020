package alarm;

import lombok.Data;

@Data
public class Radio extends RadioAlarm{
    private int volume;


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
