package net.media.training.designpattern.state;

public class Subtraction implements Operations{
    @Override
    public int calculate(int num1, int num2) {
        return num1-num2;
    }
}
