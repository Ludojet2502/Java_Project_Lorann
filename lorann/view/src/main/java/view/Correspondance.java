package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;

import model.IElement;

/**
 * 
 * @author piers
 *
 */
public class Correspondance implements ImageObserver {
	
	IElement[][] level;
	Image Image;
	BufferedImage image = null;
	
	/**
	 * 
	 */
	public Correspondance() {
		this.level = level;
	}
	
	public void setLevel(IElement[][] level) {
		this.level = level;
	}
	
	/**
	 * 
	 * @param g
	 */
	protected void paintComponent(Graphics g) {
		
		
		for (int i = 0; i<= 19; i++) {
        	for (int j = 0; j<= 11; j++) {
        		try {
        			switch(this.level[i][j].getSprite()) {
        			case 'R':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/bone.png").toURI()));
        				break;
        			case 'H':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/horizontal_bone.png").toURI()));
        				break;
        			case 'V':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/vertical_bone.png").toURI()));
        				break;
        			case 'O':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/Empty.png").toURI()));
        				break;
        			case 'L':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/lorann_u.png").toURI()));
        				break;
        			case 'A':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/purse.png").toURI()));
        				break;
        			case 'B':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/crystal_ball.png").toURI()));
        				break;
        			case 'F':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/fireball_1.png").toURI()));
        				break;
        			case 'W':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/monster_1.png").toURI()));
        				break;
        			case 'X':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/monster_2.png").toURI()));
        				break;
        			case 'Y':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/monster_3.png").toURI()));
        				break;
        			case 'Z':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/monster_4.png").toURI()));
        				break;
        			case 'P':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/gate_closed.png").toURI()));
        				break;
        			}
        			g.drawImage(image, i*32, j*32, this);
        		} catch (IOException | URISyntaxException e) {
        			e.printStackTrace();
        		}
        	}
        }
	}

	@Override
	public boolean imageUpdate(java.awt.Image img, int infoflags, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return false;
	}
}
