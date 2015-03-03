/**
 * 
 */
package jeux;

import java.awt.Color;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.tiled.TiledMap;

/**
 * @author nicolaspicart
 *
 */
public class WindowsGame extends BasicGame {

	private GameContainer container;
	private TiledMap map;
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer container = new AppGameContainer(new WindowsGame(), 800, 600, false);
		container.start();
	}
	
	public WindowsGame() {
		super("titre");
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		this.map.render(0, 0);
	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		this.container = container;
		this.map = new TiledMap("resources/map/map.tmx");
	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		// TODO Auto-generated method stub

	}
	@Override
    public void keyReleased(int key, char c) {
        if (Input.KEY_ESCAPE == key) {
            container.exit();
        }
    }

}
