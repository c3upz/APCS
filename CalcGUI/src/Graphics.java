import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Graphics extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame item1;
	private JButton b1; 
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b0;
	
	public Graphics(){
		super("Calculator");
		setLayout(new FlowLayout()); 
		
//		item1 = new JFrame("Calculator");
//		add(item1);
		
		b1 = new JButton("1");
		add(b1);
		
		b2 = new JButton("2");
		add(b2);
		
		b3 = new JButton("3");
		add(b3);
		
		b4 = new JButton("4");
		add(b4);
		
		b5 = new JButton("5");
		add(b5);
		
		b6 = new JButton("6");
		add(b6);
		
		b7 = new JButton("7");
		add(b7);
		
		b8 = new JButton("8");
		add(b8);
		
		b9 = new JButton("9");
		add(b9);
		
		b0 = new JButton("0");
		add(b0);
		
	}
	
}
