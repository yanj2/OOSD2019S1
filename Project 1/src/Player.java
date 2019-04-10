import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Player {
	
	// x position in pixel 
	private float xPos;
	
	// y position in pixel 
	private float yPos;
	
	// is the player moving ? or camera moving
	private boolean moved = false;
	
	// our Player image 
	private Image image = new Image("assets/scout.png");
	
	public Player() throws SlickException {
		this.xPos = App.WINDOW_WIDTH / 2;
		this.yPos = App.WINDOW_HEIGHT / 2;
	}
	
	public float getXPos() {
		return this.xPos;
	}
	
	public float getYPos() {
		return this.yPos;
	}
	
	public void move(float dx, float dy) {
		
		
        xPos += dx;
        yPos += dy;

		if (xPos <= 0) {
			xPos = 0;
		}
		if (xPos >= World.MAP_WIDTH * World.TILE_WIDTH) {
			xPos = World.MAP_WIDTH * World.TILE_WIDTH;
		}
		if (yPos <= 0) {
			yPos = 0;
		}
		if (yPos >= World.MAP_HEIGHT * World.TILE_HEIGHT) {
			yPos = World.MAP_HEIGHT * World.TILE_HEIGHT;
		}
		
		
    }
	
	public void update(float mouseX, float mouseY, TiledMap map, int delta) {
		
		if (moved) {
			
			if (World.distance(xPos, yPos, mouseX, mouseY) < 0.25) {
				moved = false;
			} else {
				
				float dx = mouseX - xPos;
				float dy = mouseY - yPos;
				
				float speed = delta * World.SPEED;
				double theta = Math.atan2(dy, dx);
				
				dx = (float) (speed * Math.cos(theta));
				dy = (float) (speed * Math.sin(theta));
				
				int newX = (int) (dx + xPos);
				int newY = (int) (dy + yPos);
				
				int tileID = map.getTileId(newX / World.TILE_WIDTH, newY / World.TILE_HEIGHT, 0);
				
				if (map.getTileProperty(tileID, "solid", "false").equals("true")) {
					moved = false;
				} else {
					move(dx, dx);
					//player.move(dx, dy);
					//camera.update(dx, dy);
				}
			}	
		}
	}
	
	public void render() {
		image.drawCentered(xPos, yPos);
	}
}
