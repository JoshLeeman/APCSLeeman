
import java.awt.*;
import java.applet.*;
public class GraphicsLab01v80 extends Applet{

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	
		
		g.drawRect(10,10,300,300);
		g.drawRect(100, 100, 300, 300);
		g.drawLine(10, 10, 100, 100);
		g.drawLine(310, 10, 400, 100);
		g.drawLine(10, 310, 100, 400);
		g.drawLine(310, 310, 400, 400);
	}

}
