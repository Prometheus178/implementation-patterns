package absrtract.factory.factories;

import absrtract.factory.buttons.Button;
import absrtract.factory.checkboxs.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
