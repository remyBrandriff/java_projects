// Brittany Brandriff & Brandon Mekler
// CS136L Lab 1
// Set up for a simple dropping blocks game
// Outputs final image as seen on lab documentation

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

      // Construct a rectangle
      Rectangle sBlock = new Rectangle(5, 10, 20, 40);
      Rectangle iBlock = new Rectangle(50, 10, 20, 80);
      Rectangle jBlock = new Rectangle(100, 10, 20, 60);
      Rectangle jBlock2 = new Rectangle(80, 50, 20, 20);
      Rectangle lBlock = new Rectangle(130, 10, 20, 60);
      Rectangle lBlock2 = new Rectangle(150, 50, 20, 20);
      Rectangle oBlock = new Rectangle(180, 10, 40, 40);
      Rectangle zBlock = new Rectangle(15, 100, 20, 40);
      Rectangle tBlock = new Rectangle(45, 100, 60, 20);
      Rectangle tBlock_vert = new Rectangle(45, 100, 20, 60);
      Rectangle tBlock2 = new Rectangle(65, 120, 20, 20);

      //Original shapes
      // g2.setPaint(Color.green);
      // g2.fill(sBlock);
      // g2.draw(sBlock);
      //
      // g2.setPaint(Color.cyan);
      // g2.fill(iBlock);
      // g2.draw(iBlock);

      // g2.setPaint(Color.blue);
      // g2.fill(jBlock);
      // g2.fill(jBlock2);
      // g2.draw(jBlock);
      // g2.draw(jBlock2);

      // g2.setPaint(Color.orange);
      // g2.fill(lBlock2);
      // g2.fill(lBlock);
      // g2.draw(lBlock);
      // g2.draw(lBlock2);
      //
      // g2.setPaint(Color.yellow);
      // g2.fill(oBlock);
      // g2.draw(oBlock);

      // g2.setPaint(Color.red);
      // g2.fill(zBlock);
      // g2.draw(zBlock);

      // g2.setPaint(Color.magenta);
      // g2.fill(tBlock);
      // g2.fill(tBlock2);
      // g2.draw(tBlock);
      // g2.draw(tBlock2);

      // Move rectangles
      sBlock.translate(15, 25);
      zBlock.translate(-15, 25);
      oBlock.translate(-80, 310);
      tBlock_vert.translate(115, 200);
      tBlock2.translate(75, 200);
      iBlock.translate(110,170);
      lBlock.translate(-51,249);
      lBlock2.translate(-51,249);

      // Draw moved rectangles, sometimes institute new moves
      // g2.setPaint(Color.green);
      // g2.fill(sBlock);
      // g2.draw(sBlock);

      // g2.setPaint(Color.red);
      // g2.fill(zBlock);
      // g2.draw(zBlock);

      g2.setPaint(Color.yellow);
      g2.fill(oBlock);
      g2.draw(oBlock);

      g2.setPaint(Color.magenta);
      g2.fill(tBlock_vert);
      g2.draw(tBlock_vert);
      g2.fill(tBlock2);
      g2.draw(tBlock2);

      oBlock.translate(40, -60);
      g2.setPaint(Color.yellow);
      g2.fill(oBlock);
      g2.draw(oBlock);

      g2.setPaint(Color.orange);
      g2.fill(lBlock);
      g2.draw(lBlock);
      g2.fill(lBlock2);
      g2.draw(lBlock2);
      lBlock.translate(51,-249);
      lBlock2.translate(51,-249);

      g2.setPaint(Color.cyan);
      g2.fill(iBlock);
      g2.draw(iBlock);
      iBlock.translate(-110,-170); //move iBlock back to original position to avoid issues later

      tBlock_vert.translate(-20,-100);
      tBlock2.translate(-20,-100);
      g2.setPaint(Color.magenta);
      g2.fill(tBlock_vert);
      g2.draw(tBlock_vert);
      g2.fill(tBlock2);
      g2.draw(tBlock2);

      sBlock.translate(80,225);
      g2.setPaint(Color.green);
      g2.fill(sBlock);
      g2.draw(sBlock);
      sBlock.translate(20,20);
      g2.fill(sBlock);
      g2.draw(sBlock);
      sBlock.translate(-100,-245);

      //The setup of blocks
      g2.setPaint(Color.cyan);
      g2.translate(90, 290);
      g2.rotate(Math.toRadians(90));
      g2.fill(iBlock);
      g2.draw(iBlock);

      g2.translate(9, -3);
      g2.setPaint(Color.red);
      g2.fill(sBlock);
      g2.draw(sBlock);
      g2.translate(-21, 19);
      g2.fill(sBlock);
      g2.draw(sBlock);

      sBlock.translate(-39, -40);
      g2.fill(sBlock);
      g2.draw(sBlock);
      sBlock.translate(-20,20);
      g2.fill(sBlock);
      g2.draw(sBlock);


      g2.translate(76, 34);
      g2.setPaint(Color.green);
      g2.rotate(Math.toRadians(90));
      g2.fill(sBlock);
      g2.draw(sBlock);
      g2.translate(-20, -21);
      g2.fill(sBlock);
      g2.draw(sBlock);

      g2.translate(72, -24);
      g2.setPaint(Color.blue);
      g2.rotate(Math.toRadians(90));
      g2.fill(jBlock);
      g2.fill(jBlock2);
      g2.draw(jBlock);
      g2.draw(jBlock2);

      jBlock.translate(40,82);
      jBlock2.translate(40,82);
      g2.fill(jBlock);
      g2.draw(jBlock);
      g2.fill(jBlock2);
      g2.draw(jBlock2);

      g2.translate(191, -119);
      g2.rotate(Math.toRadians(90));
      g2.setPaint(Color.orange);
      g2.fill(lBlock2);
      g2.fill(lBlock);
      g2.draw(lBlock);
      g2.draw(lBlock2);

   }
}
