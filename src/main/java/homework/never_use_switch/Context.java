package homework.never_use_switch;

import java.util.HashMap;
import java.util.function.Consumer;

public class Context {
    private HashMap<Integer, Consumer<MailInfo>> context = new HashMap<>();

    public void registerMethod(int type, Consumer<MailInfo> function){
        context.put(type, function);
    }

    public void call(Integer type, MailInfo mailInfo){
        context.get(type).accept(mailInfo);
    }
}
