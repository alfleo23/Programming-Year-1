import processing.core.*;

class Defender
{
	   PApplet sketch;
	   int x; //changes position
	   int y= 560; //constant value
	   PImage image1;
	  
	  Defender (PApplet parent, int defenderX)
	  {
		this.sketch = parent;
	    this.x= defenderX;    
	    image1 = sketch.loadImage("spaceship.png");
	  }
	  
	  void moveDefender(int direction) //when keypress
	  {
	    x = x + direction;
	  }
	  
	  void defenderRender()
	  {
	    image1.resize(100,80);
	    sketch.image ( image1, x,y);
	  }
	  
	  
	
}  // end of class Defender
