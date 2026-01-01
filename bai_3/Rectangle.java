package bai_3;

public class Rectangle implements Colorable {
    private double length, width;
    private String color;

    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
