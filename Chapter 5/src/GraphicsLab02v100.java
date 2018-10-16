import java.awt.*;
import java.applet.*;
public class GraphicsLab02v100 extends Applet{
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
		
		int a1 = 10;
		int b1 = 10;
		int a2 = 10;
		int b2 = 640;
		for (int k = 1; k < 51; k++)
		{
			g.setColor(Color.green);
			g.drawLine(a1, b1, a2, b2);
			a1 +=20;
			b2 -=12;
		}
		

		int x = 10;
		int y = 10;
		int z = 990;
		int q = 10;
		for (int k = 1; k < 51; k++)
		{
			g.setColor(Color.blue);
			g.drawLine(x,y,z,q);
			x += 20;
			q += 12;
		}
}
}