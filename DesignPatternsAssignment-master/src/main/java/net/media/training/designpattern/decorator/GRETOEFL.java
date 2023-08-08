package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 11:51:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class GRETOEFL extends EvaluationDecorator {
        Criteria criteria;

    public GRETOEFL(Criteria criteria) {
        this.criteria = criteria;
    }

    public GRETOEFL() {
    }

    @Override
    public boolean evaluate(Application theApp) {
        return theApp.getGre() > 1450 && theApp.getToefl() > 100
                && (criteria == null || criteria.evaluate(theApp));
    }
}
