
import java.awt.*;
import java.applet.*;


public class MyTrain extends Applet{
	
	public void paint(Graphics g)
	{
		
		TrainCar tc = new TrainCar(g,Color.green,240);
		TrainCar tc1 = new TrainCar(g,Color.yellow,410);
		WindowTrain wt1 = new WindowTrain(g,580);
		Caboose c1 = new Caboose(g,Color.pink,750);
		Locomotive l1 = new Locomotive(g,Color.red,70);
		
	}

}
              