package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:28:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GREEval extends EvaluationDecorator {
    Criteria criteria;

    public GREEval(Criteria c){
        this.criteria = c;
    }

    public GREEval() {
    }


    @Override
    public boolean evaluate(Application application) {
        System.out.println("GREEval is called");
        return application.getGre() > 1450 &&
                (criteria == null || criteria.evaluate(application));
    }
}
