// 3. Create a class “Shape” with a method “getArea()” that returns the area of the
// shape.Create a subclass “Rectangle” that extends “Shape” and adds fields
// “length” and “width” and overrides the “getArea()” method to return the area
// of the rectangle.Create an object of the “Shape” class and call the “getArea()”
// method.Create an object of the “Rectangle” class and call the “getArea()”
// method.


public class Assignment11 {
    public static void main(String args[]){
   Shape s1 = new Shape();
        System.out.println("Area of Shape: " + s1.getArea());

        Rectangle r1 = new Rectangle(2, 3);
        System.out.println("Area of Rectangle: " + r1.getArea());
    }
    static public class Shape{
int  getArea(){
return 0;
}
    }
    static public class Rectangle extends Shape{
        int length,width;
Rectangle(int length,int width){
this.length=length;
this.width=width;
}
@Override int getArea(){
return length*width;
}

        
    }
}
