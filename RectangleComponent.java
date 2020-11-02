import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      // Construct the various shapes, draw them, and fill in the colors
      Rectangle sBlock = new Rectangle(5, 10, 20, 40);
      Rectangle iBlock = new Rectangle(50, 10, 20, 80);
      Rectangle jBlock = new Rectangle(100, 10, 20, 60);
      Rectangle jBlock2 = new Rectangle(80, 50, 20, 20);
      Rectangle lBlock = new Rectangle(130, 10, 20, 60);
      Rectangle lBlock2 = new Rectangle(150, 50, 20, 20);
      Rectangle oBlock= new Rectangle(180, 10, 40, 40);
      Rectangle zBlock = new Rectangle(15, 100, 20, 40);
      Rectangle tBlock = new Rectangle(45, 100, 60, 20);
      Rectangle tBlock2 = new Rectangle(65, 120, 20, 20);

      g2.setPaint(Color.green);
      g2.fill(sBlock);
      g2.draw(sBlock);

      g2.setPaint(Color.cyan);
      g2.fill(iBlock);
      g2.draw(iBlock);

      g2.setPaint(Color.blue);
      g2.fill(jBlock);
      g2.fill(jBlock2);
      g2.draw(jBlock);
      g2.draw(jBlock2);

      g2.setPaint(Color.orange);
      g2.fill(lBlock2);
      g2.fill(lBlock);
      g2.draw(lBlock);
      g2.draw(lBlock2);

      g2.setPaint(Color.yellow);
      g2.fill(oBlock);
      g2.draw(oBlock);

      g2.setPaint(Color.red);
      g2.fill(zBlock);
      g2.draw(zBlock);

      g2.setPaint(Color.magenta);
      g2.fill(tBlock);
      g2.fill(tBlock2);
      g2.draw(tBlock);
      g2.draw(tBlock2);

      Rectangle iBlock_long = new Rectangle(0, 360, 80, 20);

      // Move shapes 15 units to the right and 25 units down
      sBlock.translate(15, 25);
      iBlock.translate(130, 165);
      lBlock.translate(-130, 205);
      lBlock2.translate(-130, 205);
      oBlock.translate(-79, 330);
      zBlock.translate(-15, 25);
      sBlock.translate(60, 305);

      // Draw moved shapes
      g2.setPaint(Color.green);
      g2.fill(sBlock);
      g2.draw(sBlock);

      sBlock.translate(-20,-20);
      g2.setPaint(Color.green);
      g2.fill(sBlock);
      g2.draw(sBlock);

      g2.setPaint(Color.red);
      g2.fill(zBlock);
      g2.draw(zBlock);

      g2.setPaint(Color.cyan);
      g2.fill(iBlock_long);
      g2.draw(iBlock_long);

      g2.setPaint(Color.yellow);
      g2.fill(oBlock);
      g2.draw(oBlock);

      // oBlock.translate(-60,90);
      // g2.setPaint(Color.yellow);
      // g2.fill(oBlock);
      // g2.draw(oBlock);

      g2.setPaint(Color.orange);
      g2.fill(lBlock2);
      g2.fill(lBlock);
      g2.draw(lBlock);
      g2.draw(lBlock2);
   }
}
