package models;

import java.util.ArrayList;

public class Shape {


    ArrayList<Point> pointsList = new ArrayList<>();
    private static double Perimeter;
    public Shape(){

    }

    public void addPoint(Point point){
        this.pointsList.add(point);
    }

    public void calculatePerimeter(double distance){
        this.Perimeter += distance;
    }





    // container of Points (e.g. ArrayList<Point>)

    // addPoint(Point) - adds to the container

    // calculatePerimeter()

    // getAverageSide()

    // getLongestSide()
}
