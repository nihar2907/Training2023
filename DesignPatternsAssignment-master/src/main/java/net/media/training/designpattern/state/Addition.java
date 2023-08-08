package net.media.training.designpattern.state;

public class Addition implements Operations{
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
