package processing;

import processing.core.*;

public class Main extends PApplet{
	Car[] cars = new Car[10];
	
	
	public void setup()
	{
		size(500, 500);
		smooth();		
		for (int x = 0; x < cars.length; x++)
		{
			cars[x] = new Car(this, x*50, 10 + (x * 50), (int)(Math.random()*5));
		}	
	}
	public static void main(String[] args) {
		PApplet.main(new String[] {"--present", "Main"});		
	}
	
	public void draw()
	{
		background(204);
		for (int x = 0; x < cars.length; x++)
		{
			cars[x].draw();
			cars[x].moveRight();			
		}
	}	
}
