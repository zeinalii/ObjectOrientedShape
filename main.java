
public class main {
 
 
    public static void main(String[] args) throws CloneNotSupportedException{
 
        Shape [] shapes1 = new Shape[5];
        System.out.println("Hello World!");
    }
}
class Shape implements Cloneable, Comparable<Shape> {
 
    // attributes
 
    private String color;
 
    private boolean filled;
 
 
    // constructors
 
    protected Shape() {
 
        continue;
 
    }
}
