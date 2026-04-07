import java.lang.reflect.Method;

public class ObjectReflectionAnalyser {
    public ObjectReflectionAnalyser() {}

    public static void analyzeObject(Object obj) {
        System.out.println("Analizuje obiekt: " + obj.toString());
        System.out.println("Nazwa klasy: " + obj.getClass().getName());
        System.out.println("Klasa nadrzędna: " + (obj.getClass().getSuperclass() != null ? obj.getClass().getSuperclass().getName() : "Brak"));
        System.out.println("Czy to interfejs? " + obj.getClass().isInterface());

        System.out.println("Dostępne metody:");
        Method[] methods = obj.getClass().getDeclaredMethods();
        int limit = Math.min(3, methods.length);
        for (int i = 0; i < limit; i++) {
            System.out.println(" - " + methods[i].getName());
        }

        if (methods.length > 3) {
            System.out.println(" - ... i " + (methods.length - 3) + " więcej metod");
        }

        System.out.println("Czy to TextEntity? " + (obj instanceof TextEntity));
        System.out.println("Czy to String? " + (obj instanceof String));
        System.out.println("Czy to Cloneable? " + (obj instanceof Cloneable));
        System.out.println("Czy to Comparable? " + (obj instanceof Comparable));
    }
}
