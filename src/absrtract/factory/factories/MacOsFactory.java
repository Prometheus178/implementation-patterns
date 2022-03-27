package absrtract.factory.factories;

import absrtract.factory.buttons.Button;
import absrtract.factory.buttons.MacOsButton;
import absrtract.factory.checkboxs.Checkbox;
import absrtract.factory.checkboxs.MacOsCheckbox;

public class MacOsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
