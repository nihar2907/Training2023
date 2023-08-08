package net.media.training.designpattern.observer;

public class Main {
    public static void main(String[] args) {

        Sun s = new Sun();
        s.attach(new Robot());
        s.attach(new Person());
        s.attach(new Cat());
        s.attach(new Dog());

        s.rise();
        s.set();

    }
}
