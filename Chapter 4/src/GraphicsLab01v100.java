import java.awt.*;
import java.applet.*;
public class GraphicsLab01v100 extends Applet{

	public void paint(Graphics g) {
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
		g.drawOval(600, 95, 300, 110);
		g.drawOval(600, 50, 300, 200);
		g.drawOval(600, 125, 300, 50);
		
		g.drawLine(500, 500, 700, 700);
		g.drawLine(700, 700, 300, 700);
		g.drawLine(300, 700, 500, 500);
		g.drawLine(500, 500, 450, 650);
		g.drawLine(300, 700, 450, 650);
		g.drawLine(700, 700, 450, 650);
}
}