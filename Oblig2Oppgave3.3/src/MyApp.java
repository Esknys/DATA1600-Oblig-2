import java.util.LinkedList;
import java.util.List;

public class MyApp {

    private MouseClick mouse;
    private List<Shape> shapes;

    public MyApp(MouseClick mouse, List<Shape> shapes) {
        this.shapes = shapes;
        this.mouse = mouse;
        //kobler opp musen til metoden mouseClicked
        this.mouse.attach(this::mouseClicked);
    }


    public void drawShapes() {
        for (Shape e : shapes) {
            e.draw();
            System.out.println("Drawing shape: " + e.toString());
        }
    }

    public void mouseClicked() {
        System.out.println("Mouse is clicked. Drawing shapes.");
        drawShapes();
    }

}
