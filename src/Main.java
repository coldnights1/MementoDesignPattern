public class Main {
    public static void main(String[] args) {
       Originator originator=new Originator(10,20);
       Memento memento1=new Memento(originator.height, originator.width);
       originator.height=100;
       originator.width=200;
        Memento memento2=new Memento(originator.height, originator.width);
        CareTaker careTaker=new CareTaker();
        careTaker.addMemento(memento1);
        System.out.println("current state is "+originator.height+" "+originator.width);
        Memento lastMemento=careTaker.undo();
        if(lastMemento!=null){
            originator.restoreMemento(lastMemento);
            System.out.println(originator.height+" "+ originator.width);
        }
    }
}
