package creational.method;

public class MacDialog extends Dialog{

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
