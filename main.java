
public class main {
 
 
    public static void main(String[] args) throws CloneNotSupportedException{
 
        Shape shapes1 = new Shape("Red");
        System.out.println(shapes1);
    }
}
class Shape {
 
    // attributes
 
     String color;
 
     boolean filled;
 
 
    // constructors
 
    public Shape(String x) {
 
        this.color = x;
 
    }
    public String toString(){
    return ("Color: " + this.color);
    }
}
