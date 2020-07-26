package dev.cgerbino.flappybird.display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Display {
	private JFrame jf;
	private Canvas canvas;
	private String title;
	private int width, height;



	public Display (String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
		displayCreation();
	}



	private void displayCreation() {
		//JFrame set up
		jf = new JFrame(title);
		jf.setSize(width, height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		
		//Canvas set up
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		//adding Canvas to JFrame
		jf.add(canvas);
		jf.pack();
	}
	
	public Canvas getCanvas(){
		return canvas;
	}
}