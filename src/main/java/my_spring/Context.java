package my_spring;

import java.util.Map;

public class Context {
    private Context(){

    }

    public static Context getContext(Map<Class<?>, Class<?>> map){
        ObjectFactory.getInstance().setConfig(new JavaConfig(map,"my_spring") {});
        return new Context();
    }

    public <T> Object getInstance(Class<T> clazz){
        return ObjectFactory.getInstance().createObject(clazz);
    }
}
