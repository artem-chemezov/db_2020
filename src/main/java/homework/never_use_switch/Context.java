package homework.never_use_switch;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Context {
    private Map<Integer, Consumer<MailInfo>> context = new HashMap<>();

    public void registerMethod(int type, Consumer<MailInfo> function){
        context.put(type, function);
    }

    public void call(Integer type, MailInfo mailInfo){
        context.getOrDefault(type, (mailInfo1) -> {throw new IllegalStateException();}).accept(mailInfo);
    }
}
