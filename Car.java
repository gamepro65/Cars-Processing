package processing;
import processing.core.*; 
public class Car {
	
	private int locationX, locationY, speed;
	private PApplet parent;
	
	public Car(PApplet pApp, int x, int y, int carSpeed)
	{
		locationX = x;
		locationY = y;
		speed = carSpeed;
		parent = pApp;
	}
	
	public void moveRight()
	{
		if (locationX < parent.width)
		{
			locationX += speed;
		}
		else
		{
			locationX = 0;
		}
	}
	
	public void draw()
	{
		parent.fill(255,0,0);
		parent.rect(locationX, locationY, 30, 10);
	}

}
