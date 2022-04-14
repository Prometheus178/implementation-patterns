package behavioral.interpreter.expressions;

public class OrExpression extends BaseExpression {

    public OrExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
