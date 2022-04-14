package creational.factory.factories;

import creational.factory.buttons.Button;
import creational.factory.buttons.MacOsButton;
import creational.factory.checkboxs.Checkbox;
import creational.factory.checkboxs.MacOsCheckbox;

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
