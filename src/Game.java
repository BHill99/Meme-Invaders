/* Meme Invaders is the CP Programming Version of Space invaders
 * Made by : Lucas Rotun and Brian Hill 
 */

import java.applet.*;
import java.awt.Graphics;
import java.awt.Image;

public class Game extends Applet
{
	public void paint(Graphics g){
		//Set Background to black
		Expo.setBackground(g,Expo.black);
		//Draw the images
		
		Image picture1;
		picture1 = getImage(getDocumentBase(),"never_alone__-wallpaper-1920x1080.jpg");
		g.drawImage(picture1,4800,3600,this);
		
		
		for(int k=0; k < 1000; k += 100){
	
			Expo.setColor(g,Expo.white);						Expo.setColor(g,Expo.white);						Expo.setColor(g,Expo.white);						Expo.setColor(g,Expo.white);						Expo.setColor(g,Expo.white);
			Expo.fillRectangle(g,100 + k,100,125 + k,125);		Expo.fillRectangle(g,100 + k,200,125 + k,225);		Expo.fillRectangle(g,100 + k,300,125 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);																					
			Expo.fillRectangle(g,200 + k,100,225 + k,125);		Expo.fillRectangle(g,200 + k,200,225 + k,225);		Expo.fillRectangle(g,200 + k,300,225 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);																					
			Expo.fillRectangle(g,300 + k,100,325 + k,125);		Expo.fillRectangle(g,300 + k,200,325 + k,225);		Expo.fillRectangle(g,300 + k,300,325 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);																					
			Expo.fillRectangle(g,400 + k,100,425 + k,125);		Expo.fillRectangle(g,400 + k,200,425 + k,225);		Expo.fillRectangle(g,400 + k,300,425 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);																					
			Expo.fillRectangle(g,500 + k,100,525 + k,125);		Expo.fillRectangle(g,500 + k,200,525 + k,225);		Expo.fillRectangle(g,500 + k,300,525 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);																					
			Expo.fillRectangle(g,600 + k,100,625 + k,125);		Expo.fillRectangle(g,600 + k,200,625 + k,225);		Expo.fillRectangle(g,600 + k,300,625 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);																					
			Expo.fillRectangle(g,700 + k,100,725 + k,125);		Expo.fillRectangle(g,700 + k,200,725 + k,225);		Expo.fillRectangle(g,700 + k,300,725 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);
			Expo.fillRectangle(g,800 + k,100,825 + k,125);		Expo.fillRectangle(g,800 + k,200,825 + k,225);		Expo.fillRectangle(g,800 + k,300,825 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);
			Expo.delay(250);									Expo.delay(250);									Expo.delay(250);									Expo.delay(250);									Expo.delay(250);
			Expo.setColor(g,Expo.black);						Expo.setColor(g,Expo.black);						Expo.setColor(g,Expo.black);						Expo.setColor(g,Expo.black);						Expo.setColor(g,Expo.black);
			Expo.fillRectangle(g,100 + k,100,125 + k,125);		Expo.fillRectangle(g,100 + k,200,125 + k,225);		Expo.fillRectangle(g,100 + k,300,125 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);	
			Expo.fillRectangle(g,200 + k,100,225 + k,125);		Expo.fillRectangle(g,200 + k,200,225 + k,225);		Expo.fillRectangle(g,200 + k,300,225 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);
			Expo.fillRectangle(g,300 + k,100,325 + k,125);		Expo.fillRectangle(g,300 + k,200,325 + k,225);		Expo.fillRectangle(g,300 + k,300,325 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);	
			Expo.fillRectangle(g,400 + k,100,425 + k,125);		Expo.fillRectangle(g,400 + k,200,425 + k,225);		Expo.fillRectangle(g,400 + k,300,425 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);
			Expo.fillRectangle(g,500 + k,100,525 + k,125);		Expo.fillRectangle(g,500 + k,200,525 + k,225);		Expo.fillRectangle(g,500 + k,300,525 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);	
			Expo.fillRectangle(g,600 + k,100,625 + k,125);		Expo.fillRectangle(g,600 + k,200,625 + k,225);		Expo.fillRectangle(g,600 + k,300,625 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);
			Expo.fillRectangle(g,700 + k,100,725 + k,125);		Expo.fillRectangle(g,700 + k,200,725 + k,225);		Expo.fillRectangle(g,700 + k,300,725 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);		Expo.fillRectangle(g,100 + k,500,125 + k,525);	
			Expo.fillRectangle(g,800 + k,100,825 + k,125);		Expo.fillRectangle(g,800 + k,200,825 + k,225);		Expo.fillRectangle(g,800 + k,300,825 + k,325);		Expo.fillRectangle(g,100 + k,400,125 + k,425);
		
			class Enemy{
				int x = 100 + k;
				int y = 100;
				int Width = 100;
				int Height = 100;
			}
				Rectangle Enemy = new Rectangle();
	
			}
		}
	}
}

	
	
		
	
	
		
		
		


	
	
	




	
	
	
	
	
	
	



