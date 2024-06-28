public class Main {
    public static void main(String[] args) {
        State state=new State(10,100);
       Originator originator=new Originator(state);
       Memento memento1=new Memento(originator);
       originator.state.height=100;
       originator.state.width=200;
        Memento memento2=new Memento(originator);
        CareTaker careTaker=new CareTaker();
        careTaker.addMemento(memento1);
        System.out.println("current state is "+originator.state.height+" "+originator.state.width);
        Memento lastMemento=careTaker.undo();
        if(lastMemento!=null){
            originator.restoreMemento(lastMemento);
            System.out.println(originator.state.height+" "+ originator.state.width);
        }
    }
}
