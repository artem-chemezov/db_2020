package my_spring;

/**
 * @author Evgeny Borisov
 */
@Singleton
public interface Speaker {
    void speak(String message);
}
