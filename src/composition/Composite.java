package composition;

import java.util.List;

/**
 * This is container
 */
public abstract class Composite {

    List<Component> children;

    public void addComponent(Component component){
        children.add(component);
    }

    public void deleteComponent(Component component){
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }
}
