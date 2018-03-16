
package triangle;

public class Triangle extends GeometricObject
{

    double side1, side2, side3;
    
    public Triangle()
    {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    
    public Triangle(double s1, double s2, double s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
        
    public double getSide1()
    {
        return side1;
    }
    
    public double getSide2()
    {
        return side2;
    }
        
    public double getSide3()
    {
        return side3;
    }
    
    @Override
    public double getArea()
    {
        double p = (getPerimeter() / 2.0);
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }
    @Override
    public double getPerimeter()
    {
        return (side1 + side2 + side3);
    }
    
    @Override
    public String toString()
    {
        return ("Triangle Object\nThe area is " + getArea() + "\nThe side1 is " + side1 + "\nThe side2 is " + side2 + "\nThe side3 is " + side3 + "\nThe perimeter is " + getPerimeter());
    }  
}


