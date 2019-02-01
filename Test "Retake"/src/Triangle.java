import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle {

private Color triColor;
	
	


	public Triangle(Graphics g, Color tc, int x)
	{
		int[] array = {100,200,300};
		triColor = tc;
		g.setColor(triColor);
		Polygon tr = new Polygon();
		g.setColor(Color.black);
		tr.addPoint(x,array.length);
		tr.addPoint(x-100, 250);
		tr.addPoint(x+100, 250);
		
		g.fillPolygon(tr);
		


		
	}

	
}
