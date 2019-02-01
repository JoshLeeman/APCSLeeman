import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
	JFrame myFrame = new JFrame();  //outer shell frame
	JPanel myPanel = new JPanel();  
	JLabel textLine;
	JTextField result;
	private JButton Num1;
	private JButton Num2;
	private JButton Num3;
	private JButton Num4;
	private JButton Num5;
	private JButton Num6;
	private JButton Num7;
	private JButton Num8;
	private JButton Num9;
	private JButton Num0;
	private JButton Subtract;
	private JButton Add;
	private JButton Multiply;
	private JButton Divide;
	private JButton Equals;
	private JButton Clear;

public Calculator() {
	myFrame.setLayout(new GridLayout(3,1));
	JPanel p1 = new JPanel();
	p1.setLayout(new FlowLayout());
	p1.add(result=new JTextField(""));
	JPanel p2 = new JPanel();
	p2.setLayout(new GridLayout(4,4));
	p2.add(Num1 = new JButton("1"));
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String str = e.getActionCommand();
}
public static void main(String args[]) {
	new CelciusConverter();
}
}