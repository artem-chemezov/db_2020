package my_spring;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactoryTest {


    @Test(expected = IllegalArgumentException.class)
    public void injectRandomIntForIncorrectValuesIsFailing() {
        ObjectFactory.getInstance().createObject(Developer.class);
    }

    @Test
    public void injectRandomIntIsWorking() {

        Soldier soldier = ObjectFactory.getInstance().createObject(Soldier.class);
        Assert.assertTrue(soldier.getPower() < 15 && soldier.getPower() > 7);
    }

    @Test
    public void objectWasCreatedFromConfiguredClass() {

        Config config = Mockito.mock(Config.class);

        Mockito.when(config.getImpl(SuperHero.class)).then(invocation -> Batman.class);


        ObjectFactory.getInstance().setConfig(config);
        SuperHero superHero = ObjectFactory.getInstance().createObject(SuperHero.class);
        Assert.assertEquals(Batman.class, superHero.getClass());
    }

    @Test
    public void checkCleanerIsSingleton(){
        Map<Class<?>, Class<?>> map = Map.of(
                Speaker.class, ConsoleSpeaker.class
        );


        ObjectFactory.getInstance().setConfig(new JavaConfig(map,"my_spring") {
        });

        IRobot iRobot1 = ObjectFactory.getInstance().createObject(IRobot.class);
        ObjectFactory.getInstance().setConfig(new JavaConfig(map,"my_spring") {
        });

        IRobot iRobot2 = ObjectFactory.getInstance().createObject(IRobot.class);
        Assert.assertTrue(iRobot2.getClass().getDeclaredFields()[2].equals(iRobot1.getClass().getDeclaredFields()[2]));
    }

    @Test
    public void checkSpeakerIsSingleton(){
        Map<Class<?>, Class<?>> map = Map.of(
                Speaker.class, ConsoleSpeaker.class
        );


        ObjectFactory.getInstance().setConfig(new JavaConfig(map,"my_spring") {
        });

        IRobot iRobot1 = ObjectFactory.getInstance().createObject(IRobot.class);
        ObjectFactory.getInstance().setConfig(new JavaConfig(map,"my_spring") {
        });

        IRobot iRobot2 = ObjectFactory.getInstance().createObject(IRobot.class);
        Assert.assertTrue(iRobot2.getClass().getDeclaredFields()[1].equals(iRobot1.getClass().getDeclaredFields()[1]));
    }
}























