package structure.composition;

import structure.composition.model.Circle;
import structure.composition.model.Rectangle;
import structure.composition.model.CompoundShape;
import structure.composition.model.Dot;

import java.awt.*;

public class Demo {

    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();
        imageEditor.loadShapes(new Circle(10, 10, Color.BLUE, 10),

                new CompoundShape(
                        new Circle(110, 110, Color.RED, 50),
                        new Circle(110, 110, Color.RED, 40),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, Color.GREEN, 100, 100),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );

    }
}
