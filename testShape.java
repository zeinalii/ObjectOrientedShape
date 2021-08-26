import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;




 /* Returns Shape object that can then be extended to create specific
 * Shape objects such as Rectangle, Circle, ect.
 */
abstract class Shape {
	public Shape() {
	}
	public abstract String toString();
	public abstract boolean isInside(double X, double Y);
}


/*
 * Returns Rectangle object that can then be extended to create specific rectangle
 * Rectangle class is extended from Shape object
 * @param  x:  		bottom left corner x location
 * @param  y:  		bottom left corner y location
 * @param  width:  	width of the rectangle
 * @param  length:  length of the rectangle

 * @return the rectangle object with specified location and size
 */

class Rectangle extends Shape {
    private double x, y, width, length;

    public Rectangle(double x, double y, double length, double width){
        setX(x);
        setY(y);
        setLength(length);
        setWidth(width);
    }
    public Rectangle(Rectangle rectangle) {
        setX(rectangle.x);
        setY(rectangle.y);
        setLength(rectangle.length);
        setWidth(rectangle.width);
    }
    
	public void setX(double x) {
		this.x = x;
    }  
    public void setY(double y) {
		this.y = y;
    }   
    public void setLength(double length) {
		this.length = length;
    }   
    public void setWidth(double width) {
		this.width = width;
    }  

    public double getX() {
		return this.x;
    }  
    public double getY() {
		return this.y;
    }   
    public double getLength() {
		return this.length;
    }   
    public double getWidth() {
		return this.width;
    }  
    @Override
	public String toString(){
        return "This is a 2D rectangle" +
         	   " X: " + getX()+ " Y: " + getY() + 
         	   " length: " + getLength() + " width: " + getWidth();
    }
	@Override
	public boolean isInside(double X, double Y){
		/**
		* This checks whether a point (X,Y) is inside the rectangle.
		*/
        return (getX()<= X && X<= (getX()+getLength())) && (getY()<= Y && Y<= (getY()+getWidth()));
    }
	
}


/*
 * Returns Circle object that can then be extended to create specific circle
 * Circle class is extended from Shape object
 * @param  x:  		bottom left corner x location
 * @param  y:  		bottom left corner y location
 * @param  radius:  radius of the circle

 * @return the circle object with specified location and size
 */
class Circle extends Shape {
    private double x, y, radius;

    public Circle(double x, double y, double radius){
        setX(x);
        setY(y);
        setRadius(radius);
    }
    public Circle(Circle circle) {
        setX(circle.x);
        setY(circle.y);
        setRadius(circle.radius);
    }
    
	public void setX(double x) {
		this.x = x;
    }  
    public void setY(double y) {
		this.y = y;
    }   
    public void setRadius(double radius) {
		this.radius = radius;
    }   

    public double getX() {
		return this.x;
    }  
    public double getY() {
		return this.y;
    }   
    public double getRadius() {
		return this.radius;
    }   
    @Override
	public String toString(){
        return "This is a 2D circle" +
        	   " X: " + getX()+ " Y: " + getY() + 
        	   " radius: " + getRadius();
    }
	@Override
	public boolean isInside(double X, double Y){
		/**
		* This checks whether a point (X,Y) is inside the circle.
		*/
        return ((getX()-getRadius())<= X && X <= (getX()+getRadius())) &&
        		((getY()-getRadius())<= Y && Y <= (getY()+getRadius()));
    }
	
}



public class testShape {
    @Test
    public void test_JUnit() {
        System.out.println("This is the testcase in this class");
        String str1="This is the testcase in this class";
        assertEquals("This is the testcase in this class", str1);
    }
}
