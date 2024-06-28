public class `Main {
    public static void main(String[] args) {
        State state = new State(4, 5);
        Originator originator = new Originator(state);
        CareTaker careTaker = new CareTaker();

        // Save initial state
        Memento memento1 = originator.createMemento();
        careTaker.addMemento(memento1);

        // Change state
        originator.state.width = 100;
        originator.state.height = 200;

        // Save new state
        Memento memento2 = originator.createMemento();
        careTaker.addMemento(memento2);

        System.out.println("our current state is " + originator.state.height + " " + originator.state.width);

        // Undo to previous state
        Memento lastMemento = careTaker.undo();
        if (lastMemento != null) {
            originator.restoreMemento(lastMemento);
            System.out.println("our previous state is " + originator.state.height + " " + originator.state.width);
        } else {
            System.out.println("This is the latest state");
        }
    }
}
