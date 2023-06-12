package DependencyInjectionCode;

public class CircleDI implements ShapeInterface{
    private  int radius;

    public CircleDI(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        System.out.println(3.14*radius*radius);
    }
}
