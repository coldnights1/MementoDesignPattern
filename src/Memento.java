public class Memento {
    int height,width;
    Memento(Originator originator) {
        this.height=originator.state.height;
        this.width=originator.state.width;
    }

}
