import processing.core.*;

	class Bullet
	{
	   PApplet sketch;
	   float x; 
	   int y; //changes position
	   int speedY = -15;; //moves up screen
	   
	   Bullet (PApplet parent, float bulletX, int bulletY)
	   {
		 this.sketch = parent;
	     this.x= bulletX;
	     this.y= bulletY;
	   }
	   
	   void moveBullet()
	   {
	     bulletRender();
	     y = y + speedY;
	   }
	   
	   void moveInvaderBullet()
	   {
		   bulletRender();
		   y = y + speedY * -1;
	   }
	   
	   void bulletRender()
	   {
	     sketch.fill (255,0,0);
	     sketch.rect(x,y, 8, 20);
	   }
	     
	} // end of class Bullet
