import java.awt.Color;
import java.awt.Graphics;

public class TrainCar {

	private Color carColor;
	
	
	
	public TrainCar(Graphics g, Color cc, int x)
	{
	
		carColor = cc;
		g.setColor(carColor);
		g.fillRect(x,250,150,100);
		g.setColor(Color.black);
		g.fillOval(x+5,325,50,50);
		g.fillOval(x+95,325,50,50);
		

		g.setColor(Color.black);
		g.fillRect(x+65, 280, 20, 70);
	

		g.setColor(Color.white);
		g.fillOval(x+67, 320, 5, 5);
	}

}
