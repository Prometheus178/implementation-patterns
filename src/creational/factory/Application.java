package creational.factory;

import creational.factory.buttons.Button;
import creational.factory.checkboxs.Checkbox;
import creational.factory.factories.GUIFactory;

/**
 * code using factory
 */
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
