public class ElectronicDuck extends Duck {

    ISwim swimBehaviour = new ElectronicSwimBehaviour();
    IQuack quackBehaviour = new ElectronicQuackBehaviour();

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void swim() {
        this.swimBehaviour.swim();
    }

    public void turnOn() {
        this.swimBehaviour = new ElectronicSwimBehaviour();
        this.quackBehaviour = new ElectronicQuackBehaviour();
    }

    public void turnOff() {
        this.swimBehaviour = new NoSwimBehaviour();
        this.quackBehaviour = new NoQuackBehaviour();
    }
}