package homework.never_use_switch;

import homework.never_use_switch.mails.FirstMail;
import homework.never_use_switch.mails.SecondMail;
import homework.never_use_switch.mails.ThirdMail;

/**
 * @author Evgeny Borisov
 */
public class MailDistributor {
    private Context context;

    MailDistributor(){
        this.context = new Context();

        context.registerMethod(1, new FirstMail());
        context.registerMethod(2, new SecondMail());
        context.registerMethod(3, new ThirdMail());

    }

    public void sendMailInfo(MailInfo mailInfo) {
        context.call(mailInfo.getMailType(), mailInfo);

    }
}
