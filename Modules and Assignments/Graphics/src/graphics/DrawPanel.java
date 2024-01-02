package graphics;

import java.awt.Graphics; // java code for graphics
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int width= getWidth();
		int height = getHeight();
		
		// draw from upper-left corner to lower-right
		g.drawLine(0, 0,  width, height);
		
		// draw from lower-left to upper-right
		g.drawLine(0, height, width, 0);
	}
}
