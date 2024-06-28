public class Originator {
    State state;

    Originator(State state) {
        this.state = new State(state); // Use the copy constructor
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = new State(memento.getState()); // Use the copy constructor
    }
}
