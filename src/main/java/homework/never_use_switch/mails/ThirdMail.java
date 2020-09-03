package homework.never_use_switch.mails;

import homework.never_use_switch.MailInfo;

import java.util.function.Consumer;

public class ThirdMail implements Consumer<MailInfo> {

    @Override
    public void accept(MailInfo mailInfo) {
        // todo for Leno4ka send mail Happy Birthday
        System.out.println("Happy bithday!!");
    }
}
