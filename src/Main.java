import DependencyInjectionCode.*;
import UsualCode.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //USUAL_CODE. TIGHT_COUPLING
        /*
            RectangleUL rectangle = new RectangleUL(10,10);
            AreaCalculator areaCalculator = new AreaCalculator(rectangle);
            areaCalculator.printArea(1);

            TriangleUL triangle = new TriangleUL(20,10);
            areaCalculator.setT1(triangle);
            areaCalculator.printArea(2);

            SquareUL square = new SquareUL(5);
            areaCalculator.setS1(square);
            areaCalculator.printArea(3);

            CircleUL circle = new CircleUL(10);
            areaCalculator.setC1(circle);
            areaCalculator.printArea(10);
         */

        //CODE USING DEPENDENCY INJECTION

        CircleDI circle = new CircleDI(10);
        NewAreaCalculator newAreaCalculator = new NewAreaCalculator();
        newAreaCalculator.setShape(circle);
        newAreaCalculator.printAreaOfShape();

        SquareDI square = new SquareDI(10);
        newAreaCalculator.setShape(square);
        newAreaCalculator.printAreaOfShape();

        Scanner sc = new Scanner(System.in);
          int base = sc.nextInt();
          int height = sc.nextInt();
        TriangleDI triangle = new TriangleDI(base,height);
        newAreaCalculator.setShape(triangle);
        newAreaCalculator.printAreaOfShape();

        RectangleDI rectangle= new RectangleDI(base,height);
        newAreaCalculator.setShape(rectangle);
        newAreaCalculator.printAreaOfShape();

    }
}