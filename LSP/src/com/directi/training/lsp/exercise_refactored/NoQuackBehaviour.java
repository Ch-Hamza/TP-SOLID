public class NoQuackBehaviour implements IQuack {

    @Override
    public void quack() {
        System.out.println("Can't quack when off");
    }
}