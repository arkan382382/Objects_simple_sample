/**
 * Created by Sebastian on 29.04.2017.
 */
public class testClass {
    public static void main(String[] args){

        Point originOne = new Point(10, 20);
        Rectangle one = new Rectangle(originOne, 100, 200);    // origin -> originOne
        // 200 100 0 0
        System.out.println("Show current location of rectangle: " + one.height + " " + one.width + " " + one.origin.x + " " + one.origin.y);
        one.move(9, 9);
        // 200 100 9 9
        System.out.println("Show location after change: " + one.height + " " + one.width + " " + one.origin.x + " " + one.origin.y);
        one.change(50,50);
        // 50 50 9 9
        System.out.println("Show location after change: " + one.height + " " + one.width + " " + one.origin.x + " " + one.origin.y);
    }
}

class Point{
    public int x = 0;
    public int y = 0;

    public Point(int a, int b){
        x = a;
        y = b;
    }
}

class Rectangle{
    public int width = 0;
    public int height = 0;
    public Point origin;                            // Point origin

    public Rectangle(){
        origin = new Point(0,0);
    }
    public Rectangle(Point p){
        origin = p;
    }
    public Rectangle(Point p, int w, int h){
        origin = new Point(0,0);
        width = w;
        height = h;
    }

    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }
    public void change(int x, int y){
        width = x;
        height = y;
    }
}