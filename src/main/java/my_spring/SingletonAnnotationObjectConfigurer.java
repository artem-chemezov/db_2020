package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SingletonAnnotationObjectConfigurer implements ObjectConfigurer {
    @SneakyThrows
    @Override
    public void configure(Object t) {
        if (t.getClass().isAnnotationPresent(Singleton.class)){
            ObjectFactory.getInstance().putNewInstance((Class<Object>) t.getClass(), t);
        }
    }
}