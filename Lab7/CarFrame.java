import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JFrame;

public class CarFrame extends JFrame
{
  private JFrame mainFrame; //Frame to hold buttonPanel and CustomCarComponent
  private JPanel buttonPanel; //Panel to hold buttons
  private CustomCarComponent carComp; //Component to hold cars
  private JSlider carLength; //Slider to determine the length of the car
  private JSlider frontTire; //Slider to determine the diameter of the front tire
  private JSlider backTire; //Slider to determine the diameter of the back tire
  private JButton colorButton; //Button to select the color
  private JTextField xCoord; //TextField where user can enter the x-coord
  private JTextField yCoord; //TextField where user can enter the y-coord
  private JButton addButton; //Button to add a car
  private JButton clearButton; //Removes all cars
  private int curLength; //Length given by slider
  private int curFrontTireSize; //Front tire size given by slider
  private int curBackTireSize; //Back tire size given by slider
  private Color curColor; //Color given by color chooser

  //Sets all instance variables to default values and presents the GUI to the user
  public CarFrame()
  {
    this.carLength = new JSlider(0, 200);
    this.frontTire = new JSlider(0, 50);
    this.backTire = new JSlider(0, 50);
    this.colorButton = new JButton("Choose Color");
    this.xCoord = new JTextField("600", 3);
    this.yCoord = new JTextField("300", 3);
    this.addButton = new JButton("Add");
    this.clearButton = new JButton("Clear");
    this.carComp = new CustomCarComponent();
    this.curLength = 100;
    this.curFrontTireSize = 25;
    this.curBackTireSize = 25;
    this.curColor = Color.WHITE;
    this.prepareGUI(); //Presents the complete frame
  }

  private void prepareGUI()
  {
    //Frame to hold panel and Component
    mainFrame = new JFrame("Car Test");
    //Size of the frame is set
    mainFrame.setSize(600, 600);
    //BorderLayout allows button panel to be on the left and component on the right
    mainFrame.setLayout(new BorderLayout());
    //Listens for window commands and closing
    mainFrame.addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent windowEvent)
      {
        System.exit(0);
      }
    });

    //Button panel is created
    buttonPanel = new JPanel();
    //Button Panel is given a FlowLayout
    buttonPanel.setLayout(new FlowLayout());
    //Button Panel is light Gray
    buttonPanel.setBackground(Color.lightGray);
    //Button Panel is placed at the bottom of the frame
    mainFrame.add(buttonPanel, BorderLayout.SOUTH);
    //Car component is placed in the center of the frame
    mainFrame.add(carComp, BorderLayout.CENTER);
    //Frame is visible
    mainFrame.setVisible(true);

    //Label for CarLength is added to button panel
    buttonPanel.add(new JLabel("Car length: "));
    //CarLength slider is added to button Panel
    buttonPanel.add(this.carLength);
    //Sets major ticks at intervals of 50
    carLength.setMajorTickSpacing(50);
    //Sets minor ticks at intervals of 10
    carLength.setMinorTickSpacing(10);
    //Slider will only set values where ticks are defined
    carLength.setSnapToTicks(true);
    //Paints ticks
    carLength.setPaintTicks(true);
    //Paints number labels
    carLength.setPaintLabels(true);

    //Same settings as CarLength above
    buttonPanel.add(new JLabel("Front Tire: "));
    buttonPanel.add(this.frontTire);
    frontTire.setMajorTickSpacing(25);
    frontTire.setMinorTickSpacing(5);
    frontTire.setSnapToTicks(true);
    frontTire.setPaintTicks(true);
    frontTire.setPaintLabels(true);

    //Same settings as CarLength above
    buttonPanel.add(new JLabel("Rear Tire: "));
    buttonPanel.add(this.backTire);
    backTire.setMajorTickSpacing(25);
    backTire.setMinorTickSpacing(5);
    backTire.setSnapToTicks(true);
    backTire.setPaintTicks(true);
    backTire.setPaintLabels(true);

    //adds color button to button panel
    buttonPanel.add(this.colorButton);

    //Label for xCoord is added to buttonPanel
    buttonPanel.add(new JLabel("X: "));
    //Adds xCoord text field to buttonPanel
    buttonPanel.add(this.xCoord);

    //Label for yCoord is added to buttonPanel
    buttonPanel.add(new JLabel("Y: "));
    //Adds yCoord text field to buttonPanel
    buttonPanel.add(this.yCoord);

    //Add button is added to button panel
    buttonPanel.add(this.addButton);
    //Add button's command is "Add" when pressed
    addButton.setActionCommand("Add");

    //Clear button is added to button panel
    buttonPanel.add(this.clearButton);
    //Clear button's command is "Clear" when pressed
    clearButton.setActionCommand("Clear");

    //Condenses all containers into one frame
    mainFrame.pack();
  }

  /**
  Gives each object in the button panel a listener. Each listener sets the
  current value of its respective intance variable. When the add button is
  pressed, the intance variables are used to creat a new car which is added to
  the CustomCarComponent. Finally the CustomCarComponent is repainted. The clear
  button removes all cars from the CustomCarComponent and repaints the component.
  */
  public void listen()
  {
    carLength.addChangeListener(new ChangeListener()
    {
      public void stateChanged(ChangeEvent e) //each button has an internal listener class.
      {
        JSlider source = (JSlider)e.getSource();
        curLength = source.getValue();
      }
    });

    frontTire.addChangeListener(new ChangeListener()
    {
      public void stateChanged(ChangeEvent e)
      {
        JSlider source = (JSlider)e.getSource();
        curFrontTireSize = source.getValue();
      }
    });

    backTire.addChangeListener(new ChangeListener()
    {
      public void stateChanged(ChangeEvent e)
      {
        JSlider source = (JSlider)e.getSource();
        curBackTireSize = source.getValue();
      }
    });

    colorButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
          JColorChooser color = new JColorChooser();
          //A color chooser window is opened
          curColor = color.showDialog(mainFrame, "Color Chooser", Color.WHITE);
      }
    });

    addButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        if(e.getActionCommand().equals("Add"))
        {
          CustomCar car = new CustomCar(curLength, curFrontTireSize, curBackTireSize, curColor); //new car
          car.setX(Integer.parseInt(xCoord.getText()));
          car.setY(Integer.parseInt(yCoord.getText()));
          carComp.addCar(car);
          carComp.repaint();
        }
      }
    });

    clearButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        if(e.getActionCommand().equals("Clear"))
        {
          carComp.removeAll();
          carComp.repaint();
        }
      }
    });
  }

  public static void main(String[] args) //runs the GUI
  {
    CarFrame frame = new CarFrame(); //New CarFrame created
    frame.listen(); //Button Listeners are added.
  }
}
