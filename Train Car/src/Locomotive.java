import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;

public class Locomotive extends TrainCar{

	private int x;
	
	public Locomotive(Graphics g,Color cc, int x1)
	{
		super(g,Color.blue,x1);
		x = x1;
		drawFront(g);
		drawTop(g);
		drawMiddle(g);
		drawSmoke(g);
		drawDoor(g);
		drawKnob(g);
	}
	public void drawFront(Graphics g) {
		Polygon front = new Polygon();
		front.addPoint(x,350);
		front.addPoint(x-40, 350);
		front.addPoint(x, 300);
		g.setColor(Color.black);
		g.fillPolygon(front);
		
	}	
	public void drawTop(Graphics g) {
		Polygon top = new Polygon();
		top.addPoint(x+25, 210);
		top.addPoint(x+100, 210);
		top.addPoint(x+115, 180);
		top.addPoint(x+15, 180);
		g.setColor(Color.black);
		g.fillPolygon(top);
	}
	public void drawMiddle(Graphics g) {
		g.fillRect(x+45, 210, 40, 40);
	}
	public void drawSmoke(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(x+30, 150, 30, 30);
		g.fillOval(x+65, 150, 30, 30);
		g.fillOval(x+47, 120, 30, 30);
		g.fillOval(x+82, 120, 30, 30);
		g.fillOval(x+110, 135, 30, 30);
		g.fillOval(x+142, 120, 30, 30);
	}
	public void drawDoor(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x+65, 280, 20, 70);
	
	}
	public void drawKnob(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x+67, 320, 5, 5);
	}
	
}