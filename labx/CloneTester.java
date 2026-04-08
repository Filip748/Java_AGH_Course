public class CloneTester {

    public CloneTester() {}

    public static void testCloning(TextEntity t) {
        System.out.print("Oryginalny obiekt: ");
        System.out.println(t);
        System.out.print("Sklonowany obiekt: ");
        TextEntity cloneT = t.clone();
        System.out.println(cloneT);

        System.out.println("Czy to ten sam obiekt? " + (t == cloneT));
        System.out.println("Czy obiekty są równe? " + t.equals(cloneT));

        System.out.println("HashCode oryginalnego: " + t.hashCode());
        System.out.println("HashCode sklonowanego: " + cloneT.hashCode());
    }
}
