package java_packages.Beehive;

public interface Insect {  //interface

    public static final int MAX_SIZE = 5; // Hier is een variabele altijd 'public static final'. Overal beschikbaar (public),
                                    // er bestaat maar 1 instantie van dit variabel(static)
                                    // en de waarde kan niet veranderen(static)

    abstract void eat();  // in een interface zijn de methodes altijd abstract dus dit hoeft niet meer vermeld worden
    abstract void crawl();
    abstract void pee();



}
