package drawsmiley;

// Final Exam Program - Lucas Saucer

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel
{
   
	public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // draw the face
      g.setColor( Color.YELLOW );
      g.fillOval( 10, 10, 200, 200 );
      
      // draw the eyes
      g.setColor( Color.BLACK );
      g.fillOval( 65, 65, 25, 38 );
      g.fillOval( 125, 65, 25, 38 );
      
      // draw the mouth
      g.fillOval( 50, 110, 120, 60 );
      
      // "touch up" the mouth into a smile
      g.setColor( Color.YELLOW );
      g.fillRect( 50, 110, 120, 30 );
      g.fillOval( 50, 120, 120, 40 );
      
      // draw the cheeks for the smile
      g.setColor(Color.BLACK);
      g.fillOval(160, 130, 20, 20);
      g.fillOval(40, 130, 20, 20);
        
      // "touch up" the cheeks for the smile
      g.setColor (Color.YELLOW );
      g.fillOval(32, 115, 30, 30);
      g.fillOval(158, 115, 30, 30);
      
   } // end method paintComponent
} // end class DrawSmiley
