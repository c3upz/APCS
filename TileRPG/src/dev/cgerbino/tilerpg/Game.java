package dev.cgerbino.tilerpg;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import dev.cgerbino.tilerpg.display.Display;
import dev.cgerbino.tilerpg.gfx.ImageLoader;

public class Game implements Runnable {

	private Display display;
	private boolean running = false;
	public int width, height;
	public String title;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private BufferedImage testImage;

	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		//		display = new Display (title, width, height);
	}

	private void init(){
		display = new Display (title, width, height);
		testImage = ImageLoader.loadImage("/textures/feels.png");
	}

	private void tick(){ //updates everything for the game 

	}

	private void render(){ //will render everything for the game	
		bs = display.getCanvas().getBufferStrategy(); //this will set 'bs' to whatever current bufferstrategy of the game is
		// a buffer is like a 'hidden' computer screen within your computer [buffer ---> buffer ---> actual screen]
		//use buffers so that there is no flickering
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics(); //creating the 'paintbrush'
		//Clear screen
		g.clearRect(0, 0, width, height);
		//Draw Here!
		
		g.drawImage(testImage, 50, 50, null);
		
		
		//End Drawing!
		bs.show(); //displaying to actual screen
		g.dispose(); //make sure graphics object ends properly
	}
	
	public void run() {
		init();

		while(running){
			tick();
			render();
		}
		stop();
	}

	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
