import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/kruty/IdeaProjects/Assigment_1/src/source");

        Scanner sc = new Scanner(file);

        Shape shape = new Shape();


        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);

//            System.out.println("Distance: " + point.getDistance(x, y));
//            System.out.println(point.toString(x,y));
            shape.addPoint(point);
            shape.calculatePerimeter(point.getDistance(x, y));
        }




    }
}