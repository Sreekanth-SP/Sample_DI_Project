package DependencyInjectionCode;

public class RectangleDI implements ShapeInterface{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public RectangleDI(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void printArea() {
        System.out.println(length*breadth);
    }
}
