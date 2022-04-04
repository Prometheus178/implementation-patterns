package crearter.factory.factories;

import crearter.factory.buttons.Button;
import crearter.factory.checkboxs.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
