package homework.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public interface MailSender {
    void sendMail(MailInfo mailInfo);
    int myCode();
}
