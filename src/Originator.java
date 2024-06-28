public class Originator {
    State state;

    Originator(State state)  {
        this.state=state;
    }

    public Memento createMemento() {
        return new Memento(this);
    }

    public void restoreMemento(Memento memento) {
        this.state.height=memento.height;
        this.state.width=memento.width;
    }
}
