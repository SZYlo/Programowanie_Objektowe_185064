public class Point {
    double x;
    double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point otherPoint){


        return Math.hypot(x-otherPoint.x, y-otherPoint.y);
    }
}



void main() {
    Point p1 = new Point(1,3);
    Point p2 = new Point(1,2);


    System.out.println(p1.distance(p2));
}