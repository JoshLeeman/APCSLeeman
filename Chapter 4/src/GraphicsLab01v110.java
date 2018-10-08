import java.awt.*;
import java.applet.*;
public class GraphicsLab01v110 extends Applet{

	public void paint(Graphics g) {
		g.drawRect(10,10,300,300);
		g.drawRect(100, 100, 300, 300);
		g.drawLine(10, 10, 100, 100);
		g.drawLine(310, 10, 400, 100);
		g.drawLine(10, 310, 100, 400);
		g.drawLine(310, 310, 400, 400);
		
		g.drawLine(500, 500, 700, 700);
		g.drawLine(700, 700, 300, 700);
		g.drawLine(300, 700, 500, 500);
		g.drawLine(500, 500, 450, 650);
		g.drawLine(300, 700, 450, 650);
		g.drawLine(700, 700, 450, 650);
		
		g.drawOval(50, 50, 300, 300);
		g.drawOval(150, 50, 100, 300);
		g.drawOval(100, 50, 200, 300);
		g.drawOval(180, 50, 45, 300);
		g.drawOval(50, 155, 300, 110);
		g.drawOval(50, 110, 300, 200);
		g.drawOval(50, 185, 300, 50);
	}
}
