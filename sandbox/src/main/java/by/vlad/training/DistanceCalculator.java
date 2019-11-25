package by.vlad.training;

import org.w3c.dom.css.Rect;

public class DistanceCalculator {

    public static void main(String[] args) {
        Point p1 = new Point(5,3);
        Point p2 = new Point(2,7);
        System.out.println("Расстояние между точкой с координатами ("+ p1.x + "," + p1.y + ") и точкой с координатами ("+ p2.x + "," + p2.y + ") равно " + distance(p1, p2));
    }

    public static void hello(String somebody) {
		System.out.println("Hello, " + somebody);
	}

    public static double distance(Point p1, Point p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
    }

}