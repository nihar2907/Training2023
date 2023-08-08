package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {

    private List<Observer> observers = new ArrayList<>();
    private boolean isUp;
    private  Robot robot = new Robot();
    private  Person person = new Person();
    private  Dog dog = new Dog();
    private  Cat cat = new Cat();

    public Sun() {
        attach(robot);
        attach(person);
        attach(cat);
        attach(dog);

    }

    public Sun(Robot robot, Person person, Dog dog, Cat cat) {
        this.robot = robot;
        this.person = person;
        this.dog = dog;
        this.cat = cat;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }


    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;

        if (robot.isOutdoors()) {
            robot.notifySunSet();
        }

        if (person.isOutdoors()) {
            person.notifySunSet();
        }

        if (dog.isOutdoors()) {
            dog.notifySunSet();
        }

        if (cat.isOutdoors()) {
            cat.notifySunSet();
        }
            for (Observer observer : observers) {
                observer.notifySunSet();
            }

    }

    public void rise() {
        isUp = true;
        for (Observer observer : observers) {
            observer.notifySunRose();
        }

        if (robot.isOutdoors()) {
            robot.notifySunRose();
        }

        if (person.isOutdoors()) {
            person.notifySunRose();
        }

        if (dog.isOutdoors()) {
            dog.notifySunRose();
        }

        if (cat.isOutdoors()) {
            cat.notifySunRose();
        }
    }
}