package behavior.interpreter.expressions;

public class AndExpression extends BaseExpression{

    public AndExpression(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
