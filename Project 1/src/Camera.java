import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 * This class should be used to restrict the game's view to a subset of the entire world.
 * 
 * You are free to make ANY modifications you see fit.
 * These classes are provided simply as a starting point. You are not strictly required to use them.
 */
public class Camera {
	
	private float left;
	private float right;
	private float top;
	private float bottom;
	
	public Camera(float x, float y) throws SlickException {
		this.update(x, y);
	}
	
	public boolean checkBounds() {
		// checks whether the camera has reached the outside edge. 
		// camera has a view of 1024 x 768 pixels, player is always in the middle
		return false;
	}
	
	public float getLeft() {
		// You probably want to change this.
		return this.left / 64;
	}
	public float getTop() {
		// You probably want to change this.
		return this.top / 64;
	}
	public float getRight() {
		// You probably want to change this.
		return this.right / 64;
	}
	public float getBottom() {
		// You probably want to change this.
		return this.bottom / 64;
	}
	
	private void move(float x, float y) {
		this.left -= x;
		this.right -= x;
		this.top -= y;
		this.bottom -= y;
		
		if (this.left <= 0) {
			this.left = 0;
			this.right = App.WINDOW_WIDTH;
		} else if (this.right > World.MAP_WIDTH * World.TILE_WIDTH) {
			this.right = World.MAP_WIDTH * World.TILE_WIDTH;
			this.left = this.right - App.WINDOW_WIDTH;
		}
		
		if (this.top <=  0) {
			this.top = 0;
			this.bottom = App.WINDOW_WIDTH;
		} else if (this.bottom > World.MAP_WIDTH * World.TILE_WIDTH) {
			this.bottom = World.MAP_WIDTH * World.TILE_WIDTH;
			this.top = this.top - App.WINDOW_WIDTH;
		}
	}
	
	public void update(float x, float y) {

		this.left -= x;
		this.right -= x;
		this.top -= y;
		this.bottom -= y;
		
		if (this.left <= 0) {
			this.left = 0;
			this.right = App.WINDOW_WIDTH;
		} else if (this.right > World.MAP_WIDTH * World.TILE_WIDTH) {
			this.right = World.MAP_WIDTH * World.TILE_WIDTH;
			this.left = this.right - App.WINDOW_WIDTH;
		}
		
		if (this.top <=  0) {
			this.top = 0;
			this.bottom = App.WINDOW_WIDTH;
		} else if (this.bottom > World.MAP_WIDTH * World.TILE_WIDTH) {
			this.bottom = World.MAP_WIDTH * World.TILE_WIDTH;
			this.top = this.top - App.WINDOW_WIDTH;
		}
	}
	
	public void render(TiledMap map) {
		
		int leftBound = (int) this.left / 64;
		int rightBound = (int) this.right / 64;
		int topBound = (int) this.top / 64;
		int bottomBound = (int) this.bottom / 64;
		
		for (int x = leftBound; x < rightBound; x++) {
			for (int y = topBound; y < bottomBound; y++) {
				
				map.getTileImage(x, y, 0).draw(x*World.TILE_WIDTH, y*World.TILE_HEIGHT);
			}
		}
	}
}
