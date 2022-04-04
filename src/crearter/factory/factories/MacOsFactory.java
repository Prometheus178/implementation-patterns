package crearter.factory.factories;

import crearter.factory.buttons.Button;
import crearter.factory.buttons.MacOsButton;
import crearter.factory.checkboxs.Checkbox;
import crearter.factory.checkboxs.MacOsCheckbox;

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
