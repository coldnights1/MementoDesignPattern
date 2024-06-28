import java.util.*;

public class CareTaker {
    private List<Memento> listOfMemento;

    CareTaker() {
        listOfMemento = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        listOfMemento.add(memento);
    }

    public Memento undo() {
        if (!listOfMemento.isEmpty()) {
            int lastIdx = listOfMemento.size() - 1;
            Memento memento = listOfMemento.get(lastIdx);
            listOfMemento.remove(lastIdx);
            return memento;
        }
        return null;
    }
}
