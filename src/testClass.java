/**
 * Created by Sebastian on 29.04.2017.
 * https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html
 */
public class testClass {
    public static void main(String[] args){

        Point originOne = new Point(10, 20);
        Rectangle one = new Rectangle(originOne, 100, 200);    // origin -> originOne ;)
        // 200 100 0 0
        System.out.println("Show current location of rectangle: " + one.height + " " + one.width + " " + one.origin.x + " " + one.origin.y);
        one.move(9, 9);
        // 200 100 9 9
        System.out.println("Show location after change: " + one.height + " " + one.width + " " + one.origin.x + " " + one.origin.y);
        one.change(50,50);
        // 50 50 9 9
        System.out.println("Show location after change: " + one.height + " " + one.width + " " + one.origin.x + " " + one.origin.y);

        int h = new Rectangle().height; // creates new Rectangle object and immediately gets its height. After this - objec has been executed because
                                        // program never stored the reference anywhere - objec is unreferenced.
        System.out.println("h: " + h);

        System.out.println(new Rectangle(100,5).getArea());  // 500
        System.out.println(one.getArea());                          // 2500   -> after upper change x:50, y:50

        // garbage collector - zwalnianie pamięci. In java you don't have to worry abut destroying them.
        // Java runtime environment deletes object when it determines that they are no logner being used. This process is called garbage collection.
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
    public Rectangle(int a, int b){
        width = a;
        height = b;
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
    public int getArea(){
        return width * height;
    }
}