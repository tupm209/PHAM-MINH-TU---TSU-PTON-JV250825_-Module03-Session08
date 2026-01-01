package bai_3;

public class Square implements Colorable{
    private double length;
    private String color;

    //constructor
    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
