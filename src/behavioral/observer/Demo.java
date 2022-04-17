package behavioral.observer;

import behavioral.observer.editor.Editor;
import behavioral.observer.observers.EmailNotificationListener;
import behavioral.observer.observers.LogOpenListener;

public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("save", new EmailNotificationListener("client@example.com"));
        EmailNotificationListener listener = new EmailNotificationListener("abc@example.com");
        editor.events.subscribe("save", listener);
        editor.events.unsubscribe("save", listener);


        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
