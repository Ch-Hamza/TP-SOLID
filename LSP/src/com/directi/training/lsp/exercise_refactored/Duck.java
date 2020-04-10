public class Duck {

    ISwim swimBehaviour = new SwimBehaviour();
    IQuack quackBehaviour = new QuackBehaviour();

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void swim() {
        this.swimBehaviour.swim();
    }
}
