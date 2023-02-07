package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DescribeClass {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: <string name of class or interface>");
            return;
        }

        try {
            Class<?> c = Class.forName(args[0]);

            System.out.println("#######################");
            System.out.println("Name: ");
            System.out.println(c.getSimpleName());

            System.out.println("#######################");
            System.out.println("Modifiers: ");
            System.out.println(c.getModifiers());

            System.out.println("#######################");
            System.out.println("Constructors: ");
            for (Constructor<?> e : c.getConstructors()) {
                System.out.println(e);
            }

            System.out.println("#######################");
            System.out.println("Methods: ");
            for (Method e : c.getMethods()) {
                System.out.println(e);
            }

            System.out.println("#######################");
            System.out.println("Fields: ");
            for (Field e : c.getDeclaredFields()) {
                System.out.println(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
