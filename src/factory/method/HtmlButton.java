package factory.method;

public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("<button>html button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click button html");
    }
}
