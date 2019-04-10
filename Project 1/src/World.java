import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 * This class should be used to contain all the different objects in your game world, and schedule their interactions.
 * 
 * You are free to make ANY modifications you see fit.
 * These classes are provided simply as a starting point. You are not strictly required to use them.
 */
public class World {
	
	public static final int TILE_WIDTH = 64;
	public static final int TILE_HEIGHT = 64;
	
	public static final int MAP_WIDTH = 30;
	public static final int MAP_HEIGHT = 30;
	
	public static final float SPEED = 0.25f;
	//private static final String solid = "solid";
	
	private float mouseX;
	private float mouseY;
	private boolean playerMoving = false;
	
	private final static String mapDir = "assets/main.tmx";
	
	
	private TiledMap worldMap;
	private Camera camera;
	private Player player;
	
	public World() throws SlickException {
		this.worldMap = new TiledMap(mapDir);
		this.player = new Player();
		this.camera = new Camera(0,0);
	}
	
	/* Calculates the distance between the given coordinates 
	 * 
	 * */
	public static double distance(float x, float y, float newX, float newY) {
		return Math.sqrt(Math.pow(newX - x, 2) + Math.pow(newY - y, 2));
	}
	
	public void update(Input input, int delta) {
		
		if(input.isMousePressed(Input.MOUSE_RIGHT_BUTTON)) {
			
			if (playerMoving) {
				player.update(input.getMouseX(), input.getMouseY(), worldMap, delta);
			} else {
				camera.update(input.getMouseX(), input.getMouseY(), worldMap, delta);
			}
			
//			playerMoved = true;
//			mouseX = input.getMouseX();
//			mouseY = input.getMouseY();
			
		
		}
		/*
		if (playerMoved) {
			
			float playerX = player.getXPos();
			float playerY = player.getYPos();
			
			
			
			if (distance(playerX, playerY, mouseX, mouseY) < 0.25) {
				playerMoved = false;
			} else {
				
				float dx = mouseX - playerX;
				float dy = mouseY - playerY;
				
				float speed = delta * SPEED;
				double theta = Math.atan2(dy, dx);
				
				dx = (float) (speed * Math.cos(theta));
				dy = (float) (speed * Math.sin(theta));
				
				int newX = (int) (dx + playerX);
				int newY = (int) (dy + playerY);
				
				int tileID = worldMap.getTileId(newX / TILE_WIDTH, newY / TILE_HEIGHT, 0);
				
				if (worldMap.getTileProperty(tileID, solid, "false").equals("true")) {
					playerMoved = false;
				} else {
					
					player.move(dx, dy);
					camera.update(dx, dy);
				}
				
			}
		}
		*/
	}
	
	public void render(Graphics g) {
		
		
		
		camera.render(worldMap);
		player.render();
		g.drawLine(mouseX, mouseY, player.getXPos(), player.getYPos());
	}

}
