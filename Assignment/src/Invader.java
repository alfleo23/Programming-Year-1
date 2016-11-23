import processing.core.*;

class Invader
{
	PImage seq1,seq2,seq3,seq4,seq5,seq6,seq7,seq8,seq9,seq10,seq11,seq12,seq13,seq14,seq15,seq16,seq17,seq18;
   PApplet sketch;
   float x;
   int y;
   float speedX; //moves across screen
   int bulletShot;
   int count;
  
  Invader(PApplet parent, float invaderX, int invaderY, float invaderSpeedX)
  {
	this.sketch = parent;
    this.x= invaderX;
    this.y= invaderY;
    this.speedX= invaderSpeedX;
	   seq1 = sketch.loadImage("ronnie/1.gif" );
	   seq2 = sketch.loadImage("ronnie/2.gif" );
	   seq3 = sketch.loadImage("ronnie/3.gif" );
	   seq4 = sketch.loadImage("ronnie/4.gif" );
	   seq5 = sketch.loadImage("ronnie/5.gif" );
	   seq6 = sketch.loadImage("ronnie/6.gif" );
	   seq7 = sketch.loadImage("ronnie/7.gif" );
	   seq8 = sketch.loadImage("ronnie/8.gif" );
	   seq9 = sketch.loadImage("ronnie/9.gif" );
	   seq10 = sketch.loadImage("ronnie/10.gif" );
	   seq11 = sketch.loadImage("ronnie/11.gif" );
	   seq12 = sketch.loadImage("ronnie/12.gif" );
	   seq13 = sketch.loadImage("ronnie/13.gif" );
	   seq14 = sketch.loadImage("ronnie/14.gif" );
	   seq15 = sketch.loadImage("ronnie/15.gif" );
	   seq16 = sketch.loadImage("ronnie/16.gif" );
	   seq17 = sketch.loadImage("ronnie/17.gif" );
	   seq18 = sketch.loadImage("ronnie/18.gif" );
	   count = 0;
  }
  
  
  void invaderRender()
  {
//    sketch.fill(255,0,0);
//    sketch.stroke(0);
//    sketch.ellipse(x,y,30,30);
//    sketch.fill(0,0,255);
//    sketch.stroke(0);
//    sketch.ellipse(x,y,50,15);
	  seq1.resize(130,100);
	  seq2.resize(130,100);
	  seq3.resize(130,100);
	  seq4.resize(130,100);
	  seq5.resize(130,100);
	  seq6.resize(130,100);
	  seq7.resize(130,100);
	  seq8.resize(130,100);
	  seq9.resize(130,100);
	  seq10.resize(130,100);
	  seq11.resize(130,100);
	  seq12.resize(130,100);
	  seq13.resize(130,100);
	  seq14.resize(130,100);
	  seq15.resize(130,100);
	  seq16.resize(130,100);
	  seq17.resize(130,100);
	  seq18.resize(130,100);
	    if (count < 5){
	    	sketch.image ( seq1, x,y); 
	      }
	      else if (count<10){
	        sketch.image (seq2, x,y);
	      }
	      else if (count<15){
	    	  sketch.image (seq3, x,y);
	      }else if (count<20){
	    	  sketch.image (seq4, x,y);
	      }else if (count<25){
	    	  sketch.image (seq5, x,y);
	      }else if (count<30){
	    	  sketch.image (seq6, x,y);
	      }else if (count<35){
	    	  sketch.image (seq7, x,y);
	      }else if (count<40){
	    	  sketch.image (seq8, x,y);
	      }else if (count<45){
	    	  sketch.image (seq9, x,y);
	      }else if (count<50){
	    	  sketch.image (seq10, x,y);
	      }else if (count<55){
	    	  sketch.image (seq11, x,y);
	      }else if (count<60){
	    	  sketch.image (seq12, x,y);
	      }
	      else if (count<65){
	    	  sketch.image (seq13, x,y);
		      }
	      else if (count<70){
	    	  sketch.image (seq14, x,y);
		      }
	      else if (count<75){
	    	  sketch.image (seq15, x,y);
		      }
	      else if (count<80){
	    	  sketch.image (seq16, x,y);
		      }
	      else if (count<85){
	    	  sketch.image (seq17, x,y);
		      }
	      else if (count<90){
	    	  sketch.image (seq18, x,y);
		      }
	      else{
	        count = 0;
	      }
	    count = count + 1;
  }
  
  void invaderMove()
  {
    invaderRender();
    x = x + speedX ;
  }
  
  boolean isAtTheBorder(Invader invaderToControl)
  {
    if (invaderToControl.x > sketch.width - 100 || invaderToControl.x < 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  boolean isInvaderShot(main sketch, Bullet bullet)
  {
    if (sketch.isBulletShot == 1)
    {
      if (sketch.abs(this.x-bullet.x) < 90 && sketch.abs(this.y-bullet.y) < 100)     
        return true;
    }
      return false;
  }
  
  boolean isAtTheBottom(Invader invaderToControl)
  {
    if (invaderToControl.y + 100 > 550)
    {
      return true;
    }
    return false;
  }
 
} // end of class Invader