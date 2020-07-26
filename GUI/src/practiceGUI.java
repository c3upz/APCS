import java.awt.event.KeyEvent;
import java.util.*;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class practiceGUI {
	public static void main(String[]args){
		//		String fn = JOptionPane.showInputDialog("First number");
		//		String sn = JOptionPane.showInputDialog("Second number");
		//		
		//		int num1 = Integer.parseInt(fn);
		//		int num2 = Integer.parseInt(sn);
		//		int num3 = num1 + num2;
		//		
		//		JOptionPane.showMessageDialog(null, "The anwser is " + num3, "Calculator", JOptionPane.PLAIN_MESSAGE);
		//		

		String input = JOptionPane.showInputDialog("Enter a math problem");
		Scanner s = new Scanner(input);
		double num1 = Integer.parseInt(s.next());
		String operator = s.next();
		double num2 = Integer.parseInt(s.next());

		if(operator.equals("+")){
			JOptionPane.showMessageDialog(null, "Anwser is " + (num1 + num2), "Calc", JOptionPane.PLAIN_MESSAGE);
		}else if(operator.equals("-")){
			JOptionPane.showMessageDialog(null, "Anwser is " + (num1 - num2), "Calc", JOptionPane.PLAIN_MESSAGE);

		}else if(operator.equals("*")){
			JOptionPane.showMessageDialog(null, "Anwser is " + (num1 * num2), "Calc", JOptionPane.PLAIN_MESSAGE);

		}else if(operator.equals("/")){
			JOptionPane.showMessageDialog(null, "Anwser is " + (num1 / num2), "Calc", JOptionPane.PLAIN_MESSAGE);

		}else{
			JOptionPane.showMessageDialog(null, "Invalid input", "Calc", JOptionPane.PLAIN_MESSAGE);
		}




	}
}
