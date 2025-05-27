
import java.lang.reflect.*;

public class ReflectionDemo {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionDemo");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        Object obj = cls.getDeclaredConstructor().newInstance();
        Method greet = cls.getMethod("greet", String.class);
        greet.invoke(obj, "World");
    }
}
