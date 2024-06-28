public class Memento {
    private final State state;

    Memento(State state) {
        this.state = new State(state); // Use the copy constructor
    }

    public State getState() {
        return this.state;
    }
}
