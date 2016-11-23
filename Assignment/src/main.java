import processing.core.*;

public class main extends PApplet
{
	Defender player;
	Bullet bullet1, invaderBullet;
	Invader invader1;
	int isBulletShot = 0;
	int invaderRows = 2;  //  numbers of invaders
	int invaderColumns = 2;
	float invaderX = 0;
	int invaderY = 20;
	Invader[][] grid;
	int level = 1;
	boolean isLevelFinished = true;
	int nullInvaderCounter = 0;
	int invadersAtTheBorder = 0;
	int secDelay = 0;
	int introDelay = 0;
	int shootingDelay = second() + 4;
	boolean invaderCanShoot = true;
	
	public void setup()
	{
	  size (800,650);
	  player = new Defender(this, 350); 
	  grid = new Invader[invaderColumns][invaderRows];  // Initialize the array
	  introDelay = second() + 3;
	}  // end of setup


	public void draw()
	{
	  background(255);
	  //int sec = second();
	  if (second() < introDelay && level == 1 && isLevelFinished == true)
	  { 
		  background(0);
		  //sec = second();
		  fill(255);
          textSize(70);
          text("SHOOT PENALDO", 90, height/2-100);     // an introduction to the game
      }

	  else
	  {
		  
		  	  
		  if (level == 1 && isLevelFinished == true)
		  {
				  for (int i = 0; i < invaderColumns; i++)
				  {
				    for (int j = 0; j < invaderRows; j++)
				    {
				      grid[i][j] = new Invader (this, invaderX, invaderY, 2);  // create the array of invaders (LEVEL 1)
				      invaderX= invaderX + 140;
				    }
				    invaderY = invaderY + 110;
				    invaderX = 0;
				  } 
				  invaderX = 0;
				  invaderY = 5;
				  isLevelFinished = false;
		  }
		  else if (level == 2 && isLevelFinished == true)
		  {  
			  //int secnds = second();
			  if (second() < secDelay)
			  { 
				  //secnds = second();
				  fill(0);
		          textSize(100);
		          text("LEVEL 2", 200, height/2);     // showing a text for a few seconds before LEVEL 2
	          }
			  else
			  {    
				  for (int i = 0; i < invaderColumns; i++)
				  {
				    for (int j = 0; j < invaderRows; j++)
				    {
				      grid[i][j] = new Invader (this, invaderX, invaderY, 4);  // create the array of invaders (LEVEL 2)
				      invaderX= invaderX + 140;
				    }
				    invaderY = invaderY + 110;
				    invaderX = 0;
				  }  
				  isLevelFinished = false;
			  }
			  
		  }
		  
		  player.defenderRender();    // display the defender on the screen
		    
		  if (second() > shootingDelay)
		  {
			  int rndm = (int) random(0, 1);
			  invaderBullet = new Bullet(this, grid[1][rndm].x, grid[1][rndm].y+15);
			  invaderBullet.moveInvaderBullet();
		  }
		  
		  
		  for (int i = 0; i < invaderColumns; i++)
		  {
		   for (int j = 0; j < invaderRows; j++)
		   {
		    if (grid[i][j] != null)
		    {
		    	
		      if ( grid[i][j].isAtTheBorder(grid[i][j]) )       //  loop to control if any alien of the array is at the borders
		      {    
			    	invadersAtTheBorder ++;
			        for (int a = 0; a < invaderColumns; a++)
			        {        
			         for (int b = 0; b < invaderRows; b++)
			         {
			           if (grid[a][b] != null)                        
			           {
			        	   if(invadersAtTheBorder < 2)
			        	   {
			        		   grid[a][b].speedX = grid[a][b].speedX * -1;  //  make every not null alien in the array to change direction and go down a bit           
			        		   grid[a][b].y = grid[a][b].y + 40;
			        	   }
			           }      
			          }
			         }
		 		   if(invadersAtTheBorder>1)
		 		   {
		 			   invadersAtTheBorder=0;
		 		   }
		       }
		    }  
		   }
		  }
		         
		  for (int i = 0; i < invaderColumns; i++)
		  {
		   for (int j = 0; j < invaderRows; j++)
		   {
		     if (grid[i][j] != null)
		     {
		      grid[i][j].invaderMove(); 
		      
		      if (grid[i][j].isAtTheBottom(grid[i][j]))     // if an invader reaches the defender then GAME OVER
		        {
		    	  background(255);
		          fill(0);
		          textSize(100);
		          text("GAME OVER", 100, height/2);
		          noLoop();
		        }
		      
		      if (grid[i][j].isInvaderShot(this, bullet1))
		      {                                              
		        grid[i][j] = null;
		        nullInvaderCounter ++;
		        isBulletShot = 0;
		      }
		   }
		  }
		 }
		  
		  if (isBulletShot == 1)
		  {
		   bullet1.moveBullet();   // bullet movement
		   if (bullet1.y < 0)
		   {
		     isBulletShot = 0;
		   }
		  }
		  
		  
		  
		  
		  
		  if (nullInvaderCounter >= invaderRows*invaderColumns)
		  {
			  level ++;
			  if (level > 2)
			  {
		          background(255);
				  fill(0);
				  textSize(100);
				  text("WELL DONE", 100, height/2-100);
		          textSize(50);
		          text("YOU DEFEATED PENALDO", 75, height/2+100);
		          noLoop();
		          text("FIFA is garbage !", 190, height/2 + 150);
			  }
			  else
			  {
				  isLevelFinished = true;
				  nullInvaderCounter = 0;
				  secDelay = second() + 4; 
			  }
			 
		  }
	  }
	    
	}  // end of void draw

	

	public void keyPressed()
	{
	  if (keyPressed)
	  {
	    if (key == 'f' && isBulletShot == 0) 
	    {
	      bullet1 = new Bullet(this, player.x+47,player.y-15);
	      isBulletShot = 1;
	    }
	  }
	  
	  if (key == CODED)
	  {
	    if (keyCode == LEFT && player.x >= 0)
	    {
	      player.moveDefender(-20);
	    }
	    else if (keyCode == RIGHT && player.x <= width - 100)     
	    {
	      player.moveDefender(20);
	    }
	  }
	  
	}  // end of key pressed
	
} // end of main
