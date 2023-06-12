package UsualCode;

public class AreaCalculator {
    private RectangleUL r1;
    private TriangleUL t1;
    private SquareUL s1;
    private CircleUL c1;

    public CircleUL getC1() {
        return c1;
    }

    public void setC1(CircleUL c1) {
        this.c1 = c1;
    }

    public AreaCalculator(CircleUL c1) {
        this.c1 = c1;
    }

    public SquareUL getS1() {
        return s1;
    }

    public void setS1(SquareUL s1) {
        this.s1 = s1;
    }

    public AreaCalculator(SquareUL s1) {
        this.s1 = s1;
    }

    public AreaCalculator(RectangleUL r1) {
        this.r1 = r1;
    }

    public AreaCalculator(TriangleUL t1) {
        this.t1 = t1;
    }

    public RectangleUL getR1() {
        return r1;
    }

    public void setR1(RectangleUL r1) {
        this.r1 = r1;
    }

    public TriangleUL getT1() {
        return t1;
    }

    public void setT1(TriangleUL t1) {
        this.t1 = t1;
    }

    public void printArea(int choice){
        if(choice ==1)
            System.out.println(r1.getBreadth()* r1.getLength());
        else if(choice ==2)
            System.out.println(0.5* t1.getBase()* t1.getHeight());
        else if(choice ==3)
            System.out.println(s1.getSide()* s1.getSide());
        else
            System.out.println(c1.getRadius()*c1.getRadius()*3.14);
    }
}
