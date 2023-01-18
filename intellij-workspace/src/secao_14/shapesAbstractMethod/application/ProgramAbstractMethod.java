package secao_14.shapesAbstractMethod.application;

import secao_14.shapesAbstractMethod.entities.Circle;
import secao_14.shapesAbstractMethod.entities.Shape;
import secao_14.shapesAbstractMethod.entities.enums.Color;
import secao_14.shapesAbstractMethod.entities.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramAbstractMethod {
    public static void run() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();
        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i);

            System.out.print("Recatangle or Circle (r/c)? ");
            char shape = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (shape == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shapeList.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPE AREAS:");
        for (Shape shape : shapeList) {
//            System.out.printf("%.2f\n", shape.area());
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
