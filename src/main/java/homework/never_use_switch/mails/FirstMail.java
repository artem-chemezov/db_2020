package homework.never_use_switch.mails;

import homework.never_use_switch.MailInfo;

import java.util.function.Consumer;

public class FirstMail implements Consumer<MailInfo> {
    @Override
    public void accept(MailInfo mailInfo) {
        // 60 lines of code which will send WELCOME mail
        System.out.println("WELCOME " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
