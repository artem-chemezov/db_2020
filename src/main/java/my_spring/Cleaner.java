package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Singleton
public interface Cleaner {

    void clean();
}
