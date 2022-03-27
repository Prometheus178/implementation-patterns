package absrtract.factory.factories;

import absrtract.factory.buttons.Button;
import absrtract.factory.buttons.WindowsOsButton;
import absrtract.factory.checkboxs.Checkbox;
import absrtract.factory.checkboxs.WinOsCheckbox;

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
