package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
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
public class Correspondance {
	
	Element[][] mapNiveau;
	java.awt.Image Image;
	BufferedImage image = null;
	
	/**
	 * 
	 */
	public Correspondance() {
		this.mapNiveau = mapNiveau;
	}
	
	/**
	 * 
	 * @param g
	 */
	protected void DoCorrespondance(Graphics g) {
		
		for (int i = 0; i<= 19; i++) {
        	for (int j = 0; j<= 11; j++) {
        		try {
        			switch(this.mapNiveau[i][j].getSprite()) {
        			case 'S':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/bone.png").toURI()));
        				break;
        			case 'H':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/horizontal_bone.png").toURI()));
        				break;
        			case 'V':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/vertical_bone.png").toURI()));
        				break;
        			case 'X':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/ground.png").toURI()));
        				break;
        			case 'L':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/lorann_u.png").toURI()));
        				break;
        			case 'G':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/purse.png").toURI()));
        				break;
        			case 'E':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/crystal_ball.png").toURI()));
        				break;
        			case 'P':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/fireball_1.png").toURI()));
        				break;
        			case 'F':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/monster_1.png").toURI()));
        				break;
        			case 'K':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/monster_2.png").toURI()));
        				break;
        			case 'B':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/monster_3.png").toURI()));
        				break;
        			case 'J':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/monster_4.png").toURI()));
        				break;
        			case 'C':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/gate_closed.png").toURI()));
        				break;
        			case 'O':
        				image = ImageIO.read(new File(getClass().getResource("/Sprites/gate_open.png").toURI()));
        				break;
        			}
        			g.drawImage(image, i*32, j*32, this);
        		} catch (IOException | URISyntaxException e) {
        			e.printStackTrace();
        		}
        	}
        }
	}
}
