package net.media.training.designpattern.abstractfactory;

public class IPhone implements Entities{


    @Override
    public Case getCase() {
        return null;
    }

    @Override
    public MotherBoard getMotherboard() {
        return null;
    }

    @Override
    public Processor getProcessor() {
        return null;
    }

    @Override
    public Screen getScreen() {
        return null;
    }

    @Override
    public void attachCase(Case c) {

    }

    @Override
    public void attachMotherboard(MotherBoard m) {

    }

    @Override
    public void attachProcessor(Processor p) {

    }

    @Override
    public void attachScreen(Screen s) {

    }
}
