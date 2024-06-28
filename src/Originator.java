public class Originator {
    int height,width;

    Originator(int height,int width)  {
        this.height=height;
        this.width=width;
    }

    public Memento createMemento() {
        return new Memento(this.height,this.width);
    }

    public void restoreMemento(Memento memento) {
        this.height=memento.height;
        this.width=memento.width;
    }
}
