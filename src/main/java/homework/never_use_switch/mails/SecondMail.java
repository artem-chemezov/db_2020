package homework.never_use_switch.mails;

import homework.never_use_switch.MailInfo;

import java.util.function.Consumer;

public class SecondMail implements Consumer<MailInfo> {
    @Override
    public void accept(MailInfo mailInfo) {
        // 80 lines of code which will send WELCOME mail
        System.out.println("EMAIL_CALLBACK " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
