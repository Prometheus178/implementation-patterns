package crearter.factory.factories;

import crearter.factory.buttons.Button;
import crearter.factory.buttons.WindowsOsButton;
import crearter.factory.checkboxs.Checkbox;
import crearter.factory.checkboxs.WinOsCheckbox;

public class WinOsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinOsCheckbox();
    }
}
