public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        //her tegnes sirkel
    }

    @Override
    public String toString() {
        return "Circle: " + "\n" +
                "radius = " + radius;
    }
}
