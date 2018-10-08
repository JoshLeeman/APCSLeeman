
import java.awt.*;
import java.applet.*;
public class GraphicsLab01v90 extends Applet{

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(10,10,300,300);
		g.drawRect(100, 100, 300, 300);
		g.drawLine(10, 10, 100, 100);
		g.drawLine(310, 10, 400, 100);
		g.drawLine(10, 310, 100, 400);
		g.drawLine(310, 310, 400, 400);
		
		g.drawOval(600, 10, 300, 300);
		g.drawOval(700, 10, 100, 300);
		g.drawOval(650, 10, 200, 300);
		g.drawOval(730, 10, 45, 300);
		g.drawOval(600, 100, 300, 100);
		g.drawOval(600, 50, 300, 200);
		g.drawOval(600, 125, 300, 50);
	}

}
