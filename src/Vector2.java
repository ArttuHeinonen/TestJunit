

/**
 * Struct that holds 2 values
 * @author Arttu Heinonen
 *
 */
public class Vector2 {
	public float x, y;
	
	public Vector2(){}
	
	public Vector2(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public float getCenter(){
		return x + y/2;
	}
	
	public void set(float x, float y){
		this.x = x;
		this.y = y;
	}
}
