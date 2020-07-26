package dev.cgerbino.tilerpg;

public class Launcher {
	public static void main (String[] args){
		Game game = new Game ("TileRPG", 400, 400);
		game.start();
	}
}