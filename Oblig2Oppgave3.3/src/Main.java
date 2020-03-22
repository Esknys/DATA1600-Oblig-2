import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(4);
        Shape rectangle1 = new Rectangle(5, 4);

        List<Shape> shapes = new LinkedList<Shape>();
        shapes.add(circle1);
        shapes.add(rectangle1);

        MouseClick mouse = new MouseClick();

        MyApp app = new MyApp(mouse, shapes);

        //simulerer at musen ikke er klikket og sjekker deretter
        mouse.setClicked(false);
        mouse.detectMouseClicked();
        //simulerer at musen klikkes
        mouse.setClicked(true);
        mouse.detectMouseClicked();
    }
}
