package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class CleanerImpl implements Cleaner {


    @InjectRandomInt(min = 3, max = 10)
    private int repeat = 1;

    @PostConstruct
    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVVVVVvvvvvvvvvvvvvvvvvvvv");
        }
    }
}












