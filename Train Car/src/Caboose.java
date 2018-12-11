import java.awt.Color;
import java.awt.Graphics;

public class Caboose extends TrainCar {

	private int x;

	public Caboose(Graphics g, Color cc, int x1) {
		super(g, Color.pink, x1);
		x = x1;
		drawWindows(g);
		drawDoor(g);
		drawKnob(g);
		drawTop(g);

	}

	public void drawWindows(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(x + 30, 280, 30, 30);
		g.fillRect(x + 90, 280, 30, 30);
	}

	public void drawDoor(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x + 65, 280, 20, 70);

	}

	public void drawKnob(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x + 67, 320, 5, 5);
	}

	public void drawTop(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x + 30, 240, 90, 10);
	}
}