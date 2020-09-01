package homework.riddle_game;

import design_patterns.template_method.Game;
import design_patterns.template_method.Pair;

import javax.naming.ldap.Rdn;
import javax.swing.*;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {
    private Random random = new Random();
    //todo
    private int randomNumber;
    private int maxLimit;
    private List<Pair> scores;
    RiddleGamer gamer;



    @Override
    public void play() {
        creatingRules();
        playGame();
        showScores();
    }

    private void playGame(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
        this.gamer.setGuessNumber(num);
        int res = this.gamer.turn(this.randomNumber);
        this.scores.forEach(x -> {
            if (x.getName() == this.gamer.getName()) {
                x.setScore(x.getScore() + this.maxLimit - res);
            }
        });
        if (res != 0){
            String ans = JOptionPane.showInputDialog("You lose! Do you want to play again? Yes/no");
            if (ans.equals("Yes")) {
                this.playGame();
            }
        }
    }

    private void creatingRules(){

        String name = JOptionPane.showInputDialog("Input your name");
        this.gamer = new RiddleGamer(name);
        int lim = Integer.parseInt(JOptionPane.showInputDialog("input your max limit"));
        this.maxLimit = lim;
        this.randomNumber = random.nextInt(lim);
        this.scores = List.of(new Pair(name, 0));
    }

    private void showScores(){
        System.out.println("Number was " + this.randomNumber);
        System.out.println("---------------------------------------");
        this.scores.forEach(x -> {
            System.out.println("Name: " + x.getName() + "   |||   Score: " + x.getScore());
        });
    }
}
