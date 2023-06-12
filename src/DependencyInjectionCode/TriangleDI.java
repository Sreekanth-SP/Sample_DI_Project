package DependencyInjectionCode;

import java.util.stream.IntStream;

public class TriangleDI implements ShapeInterface {
    private int base;
    private int height;

    public TriangleDI(int base,int height){
        this.base=base;
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public int getBase(){
        return base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBase(int base){
        this.base =base;
    }

    @Override
    public void printArea() {
        System.out.println(0.5*base*height);
    }
}
