import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

/**
Represents a component specifically designed for
drawing cars on the screen. Works in conjunction with
CustomCar.java.
*/
class CustomCarComponent extends JComponent
{
  private List<CustomCar> cars; //Stores a list of cars to be drawn

  /**
  Initializes a CustomCarComponent by generating an empty list,
  setting the size, and making it visible.
  */
  public CustomCarComponent()
  {
    this.cars = new ArrayList<CustomCar>(); //cars is an empty list
    this.getPreferredSize(); //Sizes the component
    this.setVisible(true); //Allows the component to be visible.
  }

  /**
  returns the dimension desired to create the CustomCarComponent.
  */
  public Dimension getPreferredSize()
  {return new Dimension (600, 600);}

  /**
  Iterates through the list of CustomCars
  and draws them to the component.
  */
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;
    for(int i = 0; i < cars.size(); i++) //loop through list of cars
    {
      CustomCar car = cars.get(i); //retrieve car from list
      car.drawCar(g2); //draw car
    }
  }

  /**
  adds a car to the list cars instantiated above.
  */
  public void addCar(CustomCar car)
  {cars.add(car);}

  //Clears all cars.
  public void removeAll()
  {cars.clear();}

  /**
  A small test to make sure the CustomCarComponent creates itself
  correctly, and is able to draw from the list within it.
  */
  public static void main(String[] args)
  {
    JFrame frame = new JFrame(); //new frame to hold the CustomCarComponent

    CustomCarComponent component = new CustomCarComponent();

    frame.add(component);
    frame.pack();
    frame.setTitle("Custom Car");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    // 3 CustomCars are created and added to the CustomCarComponent to be painted.
    CustomCar car1 = new CustomCar(60, 10, 10, Color.BLUE, 50, 50);
    CustomCar car2 = new CustomCar(100, 10, 15, Color.GREEN, 100, 100);
    CustomCar car3 = new CustomCar(50, 5, 6, Color.RED, 100, 200);
    component.addCar(car1);
    component.addCar(car2);
    component.addCar(car3);
  }
}
