
package triangle;

public class CompareArea 
{
    public static void main(String[] args)
    {
        System.out.println("\nTesting 2 Circles of the same radius: ");
        
        Circle c1Same = new Circle(5);
        Circle c2Same = new Circle(5);
        
        printResults(c1Same, c2Same);
        
        System.out.println("\n\nTesting 2 Circles of different radius: ");
        
        Circle c1Diff = new Circle(10);
        Circle c2Diff = new Circle(15);
        
        printResults(c1Diff, c2Diff);
        
        System.out.println("\n\nTesting 2 Rectangles of different size: ");
        
        Rectangle r1Diff = new Rectangle(10, 15);
        Rectangle r2Diff = new Rectangle(12, 17);
        
        printResults(r1Diff, r2Diff);
        
        System.out.println("\n\nTesting 2 Triangles of different size: ");
        
        Triangle t1Diff = new Triangle(5, 10, 15);
        Triangle t2Diff = new Triangle(7, 12, 17);
        
        printResults(t1Diff, t2Diff);
        
        System.out.println("\n\nTesting 2 different object types: ");
        
        printResults(t1Diff, r2Diff);
    }
    
    public static GeometricObject larger(GeometricObject g1, GeometricObject g2) throws DifferentTypeException
    {
       if (!(g1.getClass().equals(g2.getClass())))
       {
          throw new DifferentTypeException("Two objects are of different type");
       }
       
       if(g1.getArea() == g2.getArea())
            return null;
       else if(g1.getArea() > g2.getArea())
            return g1;
       else
            return g2;
    }
    
    public static void printResults(GeometricObject g1, GeometricObject g2)
    {
        try
        {
            GeometricObject tempG = larger(g1, g2);
            if(tempG == null)
            {
                System.out.println("Two objects have equal area");
            }
            else
            {
                System.out.println("The returned larger object is " + tempG.toString());
                
            }
        }
        catch(DifferentTypeException e)
        {
            System.out.println("Two objects are of different type");
        }
    }
}

