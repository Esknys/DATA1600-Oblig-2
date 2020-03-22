public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        //her tegnes rektangel
    }

    @Override
    public String toString() {
        return "Rectangle: " + "\n" +
                "length = " + length + "\n" +
                "height = " + height;
    }
}
