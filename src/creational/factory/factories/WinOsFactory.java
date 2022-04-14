package creational.factory.factories;

import creational.factory.buttons.Button;
import creational.factory.buttons.WindowsOsButton;
import creational.factory.checkboxs.Checkbox;
import creational.factory.checkboxs.WinOsCheckbox;

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
