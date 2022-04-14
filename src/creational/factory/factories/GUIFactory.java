package creational.factory.factories;

import creational.factory.buttons.Button;
import creational.factory.checkboxs.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
