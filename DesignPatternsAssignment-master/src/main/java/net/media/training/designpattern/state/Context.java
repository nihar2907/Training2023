package net.media.training.designpattern.state;

import java.util.List;

public class Context {
    private List<Character> operators;
    public boolean isDigit(Character c) {
        return c >= 48 && c <= 57;
    }

    public boolean isOperator(Character c) {
        return operators.contains(c);
    }

    public boolean isClear(Character c) {
        return c != null && c.equals('c');
    }

    public boolean isError() {
        return true;
    }

    public boolean isEqualsOperator(Character c) {
        return c != null && c.equals('=');
    }
}
