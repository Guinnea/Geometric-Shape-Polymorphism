package triangle;

public class Rectangle extends GeometricObject {
  private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(
      double width, double height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(
      double width, double height, String color, boolean filled) {
    this.width = width;
    this.height = height;
    setColor(color);
    setFilled(filled);
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  @Override
  public String toString()
  {
    return ("Rectangle Object\nThe area is " + getArea() + "\nThe width is " + getWidth() + "\nThe height is " + getHeight() + "\nThe perimeter is " + getPerimeter());
  }
    
}
