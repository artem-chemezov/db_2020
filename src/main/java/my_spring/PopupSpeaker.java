package my_spring;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class PopupSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
}
