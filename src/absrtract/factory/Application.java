package absrtract.factory;

import absrtract.factory.buttons.Button;
import absrtract.factory.checkboxs.Checkbox;
import absrtract.factory.factories.GUIFactory;

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
