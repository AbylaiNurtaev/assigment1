package models;

import java.util.ArrayList;

public class Point {
    private static boolean isFirstRequest = true;
    private double prevX;
    private double prevY;

    private static double newX;
    private static double newY;

    private double distance;

    public Point(double x, double y) {
        this.prevX = newX;
        this.prevY = newY;
        newX = x;
        newY = y;
    }


    public double getDistance(double x, double y){
        if (isFirstRequest){
            this.distance = 0;
            isFirstRequest = false;
        }
        else {
            newX = x;
            newY = y;


            this.distance = Math.sqrt((newX - prevX) * (newX - prevX) + (newY - prevY) * (newY - prevY));
        }
        return distance;
    }



    public String toString(double x, double y){
        return "Point " + "x: " + x + " y: " + y;
    }

    // toString
}
