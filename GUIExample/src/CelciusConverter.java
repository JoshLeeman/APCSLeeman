	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	//type of JFrame
	//Step 1: implements ActionListener.
	public class CelciusConverter implements ActionListener{
		
		JFrame myFrame = new JFrame();  //outer shell frame
		JPanel myPanel = new JPanel();  //3 buttons
		JLabel fahr;
		JTextField cels;
	public CelciusConverter() {
		myPanel.setLayout(new GridLayout(2,2));//sets how the buttons are placed
		//creating button
		cels = new JTextField("Enter Temperature");
		JButton cv = new JButton("Convert");
		fahr = new JLabel("fahrenheit");
		
		//add your buttons to the Action Listener.
		cv.addActionListener(this);
		
		//add your buttons to the panel.
		myPanel.add(cv);
		myPanel.add(cels);
		myPanel.add(fahr);
		
		//add your panel to the frame.
		myFrame.add(myPanel);
		myFrame.setTitle("CelciusConverter");
		myFrame.setSize(200, 100);
		myFrame.setVisible(true);
	}
	
	//Implement your reaction for each button.
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
String str = e.getActionCommand();   //grabbing the string name of the button
		
		System.out.println("You clicked " + str + " button");

		if (str.equals("Convert")) {
			
			double celcius = Double.parseDouble(cels.getText());
			double convert = celcius*(9/5) + 32;
			fahr.setText(convert + " fahrenheit");
		} 
		  
			
	
	}
	public static void main(String args[]) {
		new CelciusConverter();
	}
}

