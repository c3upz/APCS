package flappyBird;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener, MouseListener, KeyListener { //Listners = can take input from mouse/keyboard etc

	public static FlappyBird flappyBird;
	public final int WIDTH = 1250, HEIGHT = 800; //sets size of window 
	public Renderer renderer; //calls different class which lets us use graphics
	public Rectangle bird; //rectangle that is acting as the 'Flappy Bird'
	public ArrayList<Rectangle> columns; //column creation		
	public int ticks, yMotion; 
	public boolean started; //'gameOver' = when game is over || 'started' = when game has started
	public int gameOver=-1;
	public Random rand; //random num used for creating random lengths of columns
	public double score; 
	public static boolean hasCollided = false; 

	public FlappyBird(){ //sets up game
		JFrame jframe = new JFrame(); //frame/window of the game
		Timer timer = new Timer(20, this);

		renderer = new Renderer(); //class which calls graphics allowing us to paint/alter visual aspects of the game
		rand = new Random(); //used to create diff column heights

		jframe.add(renderer); //calling graphics from render class
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT); //sets windows width and height
		jframe.addMouseListener(this); //adding mouse listener
		jframe.addKeyListener((KeyListener) this); //adding the KeyListener
		jframe.setResizable(false); //setting false does not let user rezise the game window
		jframe.setTitle("Flappy Bird"); //setting title which is seen on boarder of the window
		jframe.setVisible(true); //this allows us to see the window and its contents

		bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20); //creating and setting how big the bird/rectangle should be 
		columns = new ArrayList<Rectangle>(); //creating arrayList of columns

		addColumn(true); //pre loading / adding columns
		addColumn(true);
		addColumn(true);
		addColumn(true);

		timer.start();
	} //FlappyBird() class closer
	public boolean intersects(Rectangle col, Rectangle bird, boolean upper){
		if(bird.x>col.x-bird.width && bird.x < col.x+col.width){
			if(upper && bird.y>col.y+col.height)return true;
			if(!upper && bird.y<col.y-bird.height)return true;
		}
		return false;
	}
	public void addColumn(boolean start){ //this class adds columns 
		int space = 250; //controls how big the columns are
		int width = 100;
		int height = 50 + rand.nextInt(400); //rand being use to set diff column heights 

		if(start){//if else statement for adding columns
			columns.add(new Rectangle(WIDTH + width + columns.size() * 300, HEIGHT - height - 120, width, height));
			columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300, 0, width, HEIGHT - height - space));
		}else{
			columns.add(new Rectangle(columns.get(columns.size() - 1).x + 600, HEIGHT - height- 120, width, height));
			columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
		}
	}

	public void paintColumn(Graphics g, Rectangle column){ //this class changes visual aspects of the column such as color
		g.setColor(Color.green.darker().darker());
		g.fillRect(column.x, column.y, column.width, column.height);
	} 

	public void jump(){ //defines what a 'jump' is for the rectangle/bird
		if(gameOver>=0){ //tells program what to do if game is over and button is clicked
			bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
			columns.clear();
			yMotion = 0; //Variable for motion on yAxis
			score = 0;

			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);

			gameOver = -1;
		}

		if(!started){ //this part will start the game if a button is pressed
			started = true;
		}
		if (gameOver==-1){ //this sets what a jump is equal too
			if(yMotion > 0){
				yMotion = 0;
			}
			yMotion -= 20; //changing this will change the size of the jump 
		}
	}

	public void actionPerformed(ActionEvent e) {
		int speed = 10; //when you change speed make sure to change other variables which will also alter

		ticks++;

		if(started){
			for(int i = 0; i < columns.size(); i++){
				Rectangle column = columns.get(i);
				column.x -= speed; //this causes the columns to move across the screen
			}

			if(ticks % 2 == 0 && yMotion < 15){
				yMotion += 4; //changes how fast the bird falls
			}

			for(int i = 0; i < columns.size(); i++){
				Rectangle column = columns.get(i);

				if(column.x + column.getWidth() < 0){
					columns.remove(column);

					if (column.y==0){ //making sure we don't create columns that are 0px tall
						addColumn(false);
					}
				}
			}

			bird.y += yMotion; //setting the yVal of bird to yMotion

			for(int i = 0; i < columns.size();i++){
				Rectangle column = columns.get(i);
				if(column.y == 0 && bird.x + bird.width / 2 > column.x + column.width / 2 - 10 && bird.x + bird.width / 2 < column.x + column.width / 2 + 10) { 
					score += .5;																						// the -10 and + 10 account for the speed 
				}																										  //  of the Rectangle bird. Score is +
				boolean xx; 
				else if (intersects(column, bird, xx)){
					System.out.println(i);
					gameOver = i;
					bird.x = column.x - bird.width;
					bird.y += 4;
				}
			}
				

			if(bird.y > HEIGHT - 120 || bird.y < 0){
				gameOver = 9999;
			} else if (bird.y + yMotion >= HEIGHT - 120){
				bird.y = HEIGHT - 120 - bird.height;
			}
			if(gameOver>0 && gameOver!=9999)bird.x=columns.get(gameOver).x - bird.width;
		}
		
	
		renderer.repaint();
	}
	
	public void repaint(Graphics g) { //painting parts of the game
		g.setColor(Color.cyan); //background
		g.fillRect(0, 0, WIDTH, HEIGHT); 

		g.setColor(Color.orange); //ground
		g.fillRect(0, HEIGHT - 120, WIDTH, 150);

		g.setColor(Color.green); //columns
		g.fillRect(0, HEIGHT - 120, WIDTH, 20);

		g.setColor(Color.red); //bird
		g.fillRect(bird.x, bird.y, bird.width, bird.height);

		for(Rectangle column : columns){
			paintColumn(g, column);
		}

		g.setColor(Color.white); //setting color / font family for the following text being printed on the screen
		g.setFont(new Font("Arial", 1, 100));

		if(!started){
			g.drawString("Click to Start!", 278, HEIGHT / 2 - 50); //prints click to start on screen
		}

		if(gameOver>=0){
			g.drawString("Game Over", 330, HEIGHT / 3 - 50); //prints game over on screen
			//g.drawString("Highscore: " + score, 400 , HEIGHT/2);
			g.drawString("Click to try again!", 300, HEIGHT / 2  - 50); //prints game over on screen
		}

		if(gameOver<0 && started){
			g.drawString("Score: " + String.valueOf((int)(score)), 50, 300); //shows/prints score on the game window
		}																				  
	}

	public static void main(String[] args){//calls 'FlappyBird()'
		flappyBird = new FlappyBird(); //creating a new instance of "FlappyBird()"
	}//main method closer

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		jump(); //when a mouse key is pressed it will call the 'jump()' method which will cause the bird to jump
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		jump(); //when a key is pressed it will call the 'jump()' method which will cause the bird to jump 
	}

	public void keyReleased(KeyEvent e) {
	}
}//class FlappyBird closer
