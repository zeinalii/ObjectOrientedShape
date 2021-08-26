private abstract class Shape implements Cloneable, Comparable<Shape> {
 
    // attributes
 
    private String color;
 
    private boolean filled;
 
 
    // constructors
 
    protected Shape() {
 
        this("White", true);
 
    }
 
 
    protected Shape(String color, boolean filled) {
 
        setColor(color);
 
        setFilled(filled);
 
    }
 
 
    // methods
 
    public String getColor() {
 
        return color;
 
    }
 
 
    public void setColor(String color) {
 
        this.color = color;
 
    }
 
 
    public boolean isFilled() {
 
        return filled;
 
    }
 
 
    public void setFilled(boolean f) {
 
        filled = f;
 
    }
 
 
    public String toString() {
 
        return "Color: " + color + "\n" + (filled ? "Filled. " : "Not filled. ");
 
    }
 
 
    public abstract double getArea();
 
 
    public abstract double getPerimeter();
 
    
 
    public int compareTo(Shape shp) {
 
        if(this.getArea() > shp.getArea()) 
 
            return 1;
 
        if(this.getArea() < shp.getArea())
 
            return -1;
 
        return 0;
 
    }
 
 
    public Object clone() throws CloneNotSupportedException{
 
        return super.clone();
 
    }
 
}

public class main {
 
 
    public static void main(String[] args) throws CloneNotSupportedException{
 
        Shape [] shapes1 = new Shape[5];
        System.out.println("Hello World!");
    }
}
