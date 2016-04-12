/* Meme Invaders is the CP Programming Version of Space invaders
 * Made by : Lucas Rotun and Brian Hill 
 */

import java.applet.*;
import java.awt.Graphics;
import java.awt.Image;


public class Galiga extends Applet
{
	public void paint(Graphics g){
		//Set Background to black
		Expo.setBackground(g,Expo.black);
	}
	
		Image picture1,picture2,picture3,picture4;
	
	public void init(){
		picture1 = getImage(getDocumentBase(),"ENEMY1.jpg");
		picture2 = getImage(getDocumentBase(),"ENEMY2.jpg");
		picture3 = getImage(getDocumentBase(),"ENEMY3.jpg");
		picture4 = getImage(getDocumentBase(),"PLAYER.jpg");
	}

	public void paint(Graphics g){
		g.drawImage(picture1,300,200,this);
		g.drawImage(picture2,600,200,this);
		g.drawImage(picture3,900,200,this);
		g.drawImage(picture4,600,500,this);
	
	}

}	



