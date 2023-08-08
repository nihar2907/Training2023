package net.media.training.designpattern.abstractfactory;

public interface Entities{


      Case getCase();
      MotherBoard getMotherboard();
      Processor getProcessor();
      Screen getScreen();

    void attachCase(Case c);
    void attachMotherboard(MotherBoard m);
    void attachProcessor(Processor p);
    void attachScreen(Screen s);

}
