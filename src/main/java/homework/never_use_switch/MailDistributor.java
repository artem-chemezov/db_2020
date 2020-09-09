package homework.never_use_switch;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailDistributor {

    private Map<Integer,MailSender> mailSenderMap = new HashMap<>();

    public MailDistributor(@Autowired Set<MailSender> senders) {
        senders.forEach(sender -> mailSenderMap.put(sender.myCode(), sender));
    }

    public void sendMailInfo(MailInfo mailInfo) {
        MailSender mailSender = mailSenderMap.getOrDefault(mailInfo.getMailType(), new DefaultMailSender());
        mailSender.sendMail(mailInfo);
    }
}











