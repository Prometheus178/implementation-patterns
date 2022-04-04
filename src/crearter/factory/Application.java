package crearter.factory;

import crearter.factory.buttons.Button;
import crearter.factory.checkboxs.Checkbox;
import crearter.factory.factories.GUIFactory;

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
