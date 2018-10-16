import java.awt.*;
import java.applet.*;
public class GraphicsLab02v90 extends Applet{
	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		for (int k = 1; k < 51; k++)
		{
			g.drawLine(x1,y1,x2,y2);
			x1 += 20;
			y2 -= 12;
			
		}
		
		int a = 10;
		int b = 640;
		int c = 990;
		int d = 640;
		for (int k = 1; k<51; k++)
		{
			g.setColor(Color.red);
			g.drawLine(a,b,c,d);
			c -= 20;
		    b -= 12;
		}
		
		
		
}
}