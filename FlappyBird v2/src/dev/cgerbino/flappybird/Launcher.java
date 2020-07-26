package dev.cgerbino.flappybird;

import dev.cgerbino.flappybird.display.Display;

public class Launcher {

	public static void main(String[] args) {
		Game game = new Game ("Title", 300, 300);
		game.start();
		//Display s = new Display ("Title", 400,400);
	}

}
