package my_spring;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Map<Class<?>, Class<?>> map = Map.of(
                Speaker.class, ConsoleSpeaker.class
                );


        Context context = Context.getContext(map);

        IRobot iRobot = (IRobot) context.getInstance(IRobot.class);
        iRobot.cleanRoom();
    }
}
