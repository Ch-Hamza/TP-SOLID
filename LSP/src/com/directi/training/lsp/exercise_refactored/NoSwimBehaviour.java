public class NoSwimBehaviour implements ISwim {

    @Override
    public void swim() {
        System.out.println("Can't swim when off");
    }
}