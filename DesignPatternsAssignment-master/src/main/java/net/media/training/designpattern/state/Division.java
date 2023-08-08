package net.media.training.designpattern.state;

public class Division implements Operations{
    @Override
    public int calculate(int num1, int num2) {
        try {
            if(num2 != 0){
                return num1/num2;
            }
        }catch (Throwable e){
            System.out.println(e);
        }
        return -1;
    }
}
