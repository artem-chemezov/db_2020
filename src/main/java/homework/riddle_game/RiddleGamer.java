package homework.riddle_game;

public class RiddleGamer {
    private String name;
    private int guessNumber;

    public int turn(int randomNumber){
        return Math.abs(randomNumber - this.guessNumber);
    }


    public RiddleGamer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }
}
