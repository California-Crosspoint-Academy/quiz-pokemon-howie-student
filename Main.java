public class Main {
    public static void main(String[] args) {
        // Create six Pokemon OBJECTS by calling the Pokemon CONSTRUCTOR with data.
        Pokemon mewtwo = new Pokemon("Mewtwo", 100, "Hyper Beam", "Psychic", "Blizzard", "Thunder");
        Pokemon mew = new Pokemon("Mew", 100, "Hyper Beam", "Fire Blast", "Blizzard", "Thunder");
        Pokemon zapdos = new Pokemon("Zapdos", 100, "Thunder", "Sky Attack", "Hyper Beam", "Drill Peck");
        Pokemon articuno = new Pokemon("Articuno", 100, "Blizzard", "Ice Beam", "Sky Attack", "Hyper Beam");
        Pokemon moltres = new Pokemon("Moltres", 100, "Fire Blast", "Sky Attack", "Hyper Beam", "Double-Edge");
        Pokemon dragonite = new Pokemon("Dragonite", 100, "Hyper Beam", "Thunder", "Fire Blast", "Surf");

        // Call an INSTANCE METHOD on each object to print its formatted move card.
        mewtwo.printPokemon();
        mew.printPokemon();
        zapdos.printPokemon();
        articuno.printPokemon();
        moltres.printPokemon();
        dragonite.printPokemon();
    }
}

// Class definition: a blueprint for creating Pokemon objects.
class Pokemon {
    // FIELDS (instance variables): each object keeps its own copy of these.
    // Using default (package-private) access here for simplicity in a single-file demo.
    String name;
    int level;
    String move1;
    String move2;
    String move3;
    String move4;

    // CONSTRUCTOR: runs when you use 'new'. Initializes the fields for this object.
    Pokemon(String name, int level, String m1, String m2, String m3, String m4) {
        // 'this' refers to the current object being constructed.
        this.name = name;
        this.level = level;
        this.move1 = m1;
        this.move2 = m2;
        this.move3 = m3;
        this.move4 = m4;
    }

    // INSTANCE METHOD: uses the object's fields to do work (print a pokemon and their moves here).
    void printPokemon() {
        System.out.println(name + " (Level " + level + ")");
        System.out.println("1) " + move1);
        System.out.println("2) " + move2);
        System.out.println("3) " + move3);
        System.out.println("4) " + move4);
        System.out.println();
    }
}
