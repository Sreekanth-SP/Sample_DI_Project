package DependencyInjectionCode;

public class SquareDI implements ShapeInterface{
    private int side;
    public SquareDI(int side){
        this.side = side;
    }
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        this.side =side;
    }

    @Override
    public void printArea() {
        System.out.println(side*side);
    }
}
