package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:26:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class GPAEval implements Criteria {
    Criteria criteria;

    public GPAEval(Criteria c){
        this.criteria = c;
    }

    public GPAEval() {
    }

    @Override
    public boolean evaluate(Application application) {
        System.out.println("GPAEval is called");
        return application.getGpa() > 10 &&
                (criteria == null || criteria.evaluate(application));
    }

}
