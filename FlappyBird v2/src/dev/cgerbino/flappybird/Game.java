package dev.cgerbino.flappybird;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import dev.cgerbino.flappybird.display.Display;

public class Game implements Runnable {

	private Display display;
	private String title;
	private int width, height;
	private boolean running = false;
	private Thread thread;

	private BufferStrategy bs;
	private Graphics g;

	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		//display = new Display(title, width, height);
	}

	private void init(){
		display = new Display(title, width, height);
	}

	private void update(){

	}

	private void render(){
		bs = display.getCanvas().getBufferStrategy();

		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		
		g.clearRect(0, 0, width, height);
		//draw start
		
		//draw end
		bs.show();
		bs.dispose();
	}

	public void run() {
		init();
		while(running){
			update();
			render();
		}
		stop();
	}

	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
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
