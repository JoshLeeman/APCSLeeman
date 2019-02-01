import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class TriangleCircle extends Triangle{

	
	private int x;
	
	
	
	public TriangleCircle(Graphics g, Color tc, int x1)
	{
		
		super(g,Color.blue,x1); 
	x = x1;
	drawCircle(g, tc);
	
		
	}
	public void drawCircle(Graphics g, Color tc) {
	g.setColor(tc);
	g.fillOval(x-15, 135, 30, 30);
	}
	
	
	
}


