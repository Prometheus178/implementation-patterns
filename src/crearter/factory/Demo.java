package crearter.factory;

import crearter.factory.factories.GUIFactory;
import crearter.factory.factories.MacOsFactory;
import crearter.factory.factories.WinOsFactory;

public class Demo {

    public static void main(String[] args) {
        Application application = configureApp();
        application.paint();
    }

    private static Application configureApp() {
        Application application;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            guiFactory = new MacOsFactory();
            application = new Application(guiFactory);
        }else{
            guiFactory = new WinOsFactory();
            application = new Application(guiFactory);
        }
        return application;
    }
}
