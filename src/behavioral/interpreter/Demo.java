package behavioral.interpreter;


import behavioral.interpreter.expressions.AndExpression;
import behavioral.interpreter.expressions.Expression;
import behavioral.interpreter.expressions.OrExpression;
import behavioral.interpreter.expressions.TerminalExpression;

public class Demo {

    public static void main(String[] args) {
        Expression isCore = getCore();
        Expression isEE = getEE();
        System.out.println("Does developer know core " + isCore.interpret("JAVA"));
        System.out.println("Does developer know core " + isEE.interpret("JAVA EE"));
    }

    static Expression getCore() {
        Expression java = new TerminalExpression("JAVA");
        Expression core = new TerminalExpression("JAVA CORE");
        return new OrExpression(java, core);
    }

    static Expression getEE() {
        Expression javaEE = new TerminalExpression("EE");
        Expression core = new TerminalExpression("JAVA");
        return new AndExpression(core, javaEE);
    }
}
