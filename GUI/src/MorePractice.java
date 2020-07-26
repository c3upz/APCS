import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MorePractice extends JFrame{
	
	private JLabel item1;
	private JButton item2;
	
	public MorePractice(){
		super("This is the title"); //this is is setting the title of the window
		setLayout(new FlowLayout()); //this sets the layout to a default layout
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This will show up when you hover the cursor over it");
		add(item1);	
		
		
		item2 = new JButton("This is button"); //adding a button
		add(item2);
	}
	
	
	
	
	
}
