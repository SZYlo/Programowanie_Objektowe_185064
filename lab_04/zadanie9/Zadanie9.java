package zadanie9;

class Game {
    public final void initialize() { System.out.println("Init"); }
    public void start() { System.out.println("Start"); }
}

class RPG extends Game {
    @Override
    public void start() { System.out.println("Start RPG"); }
    
    // @Override
    // public void initialize() { } // nie  mozna nadpisac metody finalnej
}

final class FinalClass {}

// class SubClass extends FinalClass {} // nie mozna dziedziczyc po klasie finalnej
