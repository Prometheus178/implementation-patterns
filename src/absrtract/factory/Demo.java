package absrtract.factory;

import absrtract.factory.factories.GUIFactory;
import absrtract.factory.factories.MacOsFactory;
import absrtract.factory.factories.WinOsFactory;

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
