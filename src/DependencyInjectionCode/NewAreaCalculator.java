package DependencyInjectionCode;

public class NewAreaCalculator {
    private ShapeInterface shape;
    public void setShape(ShapeInterface shape) {
        this.shape = shape;
    }
    public void printAreaOfShape(){
        shape.printArea();
    }
}
