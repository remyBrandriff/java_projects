import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

class CustomCar
{
  // Instance variables with information about the car
  private int carLength;
  private int frontWheelSize;
  private int backWheelSize;
  private Color color;
  private int x;
  private int y;

  // Default constructor
  public CustomCar()
  {
    this.carLength = 100;
    this.frontWheelSize = 25;
    this.backWheelSize = 25;
    this.color = Color.WHITE;
    this.x = 150;
    this.y = 150;
  }

  // Fully customized constructor
  public CustomCar(int carLength, int frontWheelSize, int backWheelSize, Color color, int x, int y)
  {
    this.carLength = carLength;
    this.frontWheelSize = frontWheelSize;
    this.backWheelSize = backWheelSize;
    this.color = color;
    this.x = x;
    this.y = y;
  }

  // Constructor without specification for the X and Y coordinates
  public CustomCar(int carLength, int frontWheelSize, int backWheelSize, Color color)
  {
    this.carLength = carLength;
    this.frontWheelSize = frontWheelSize;
    this.backWheelSize = backWheelSize;
    this.color = color;
  }

  // Sets the length of the car
  public void setLength(int len)
  {this.carLength = len;}

  // Sets the radius of the front wheel
  public void setFrontWheel(int fws)
  {this.frontWheelSize = fws;}

  // Sets the radius of the back wheel
  public void setBackWheel(int bws)
  {this.backWheelSize = bws;}

  // Sets the color
  public void setColor(Color color)
  {this.color = color;}

  // Sets the x coordinate
  public void setX(int x)
  {this.x = x;}

  // Sets the y coordinate
  public void setY(int y)
  {this.y = y;}

  // Draws car according to the information in the instance variables
  public void drawCar(Graphics2D g2)
  {

    Rectangle body
    = new Rectangle(this.x, this.y, this.carLength, this.carLength/4);

    Ellipse2D.Double backWheel
    = new Ellipse2D.Double(this.x + carLength - (this.carLength/3), this.y - this.backWheelSize / 2 + (this.carLength/4), this.backWheelSize, this.backWheelSize);

    Ellipse2D.Double frontWheel
    = new Ellipse2D.Double(this.x + (this.carLength/6), this.y - this.frontWheelSize / 2 + (this.carLength/4), this.frontWheelSize, this.frontWheelSize);

    // Creates a trapezoid that creates the windshield
    Point2D.Double backPointBottom = new Point2D.Double(this.x + (this.carLength/6), this.y);
    Point2D.Double backPointTop = new Point2D.Double(this.x + (this.carLength/3), this.y - (this.carLength/4));
    Point2D.Double frontPointTop = new Point2D.Double(this.x + this.carLength - (this.carLength/3), this.y - (this.carLength/4));
    Point2D.Double frontPointBottom = new Point2D.Double(this.x + this.carLength - (this.carLength/6), this.y);
    Line2D.Double frontWindShield = new Line2D.Double(frontPointBottom, frontPointTop);
    Line2D.Double roof = new Line2D.Double(backPointTop, frontPointTop);
    Line2D.Double backWindShield = new Line2D.Double(backPointBottom, backPointTop);

    //Draws the car piece by piece
    g2.setColor(this.color);
    g2.fill(body);
    g2.setColor(Color.BLACK);
    g2.fill(frontWheel);
    g2.fill(backWheel);
    g2.setColor(this.color);
    g2.draw(frontWindShield);
    g2.draw(backWindShield);
    g2.draw(roof);
  }
}
