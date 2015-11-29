import java.awt.Rectangle;

public class RectangleCollision {

	private Rectangle collider, wall;
	private Vector2 xv1, xv2, yv1, yv2, center1, center2;
	private float x, y, c1, c2;
	
	public RectangleCollision() {
		collider = new Rectangle();
		wall = new Rectangle();
	}
	
	public boolean doesRectanglesCollide(){
		return collider.intersects(wall);
	}
	
	public void setColliderValues(int x, int y, int w, int h){
		collider.setBounds(x, y, w, h);
	}
	
	public void setWallValues(int x, int y, int w, int h){
		wall.setBounds(x, y, w, h);
	}
	
	public Vector2 adjustCollision(){
		
		xv1 = new Vector2(wall.x, wall.x + wall.width);
		xv2 = new Vector2(collider.x, collider.x + collider.width);
		
		yv1 = new Vector2(wall.y, wall.y + wall.height);
		yv2 = new Vector2(collider.y, collider.y + collider.height);
		
		center1 = new Vector2((float)wall.getCenterX(), (float)wall.getCenterY());
		center2 = new Vector2((float)collider.getCenterX(), (float)collider.getCenterY());
		
		if(center1.x < center2.x){
			x = xv2.x - xv1.y;
		}
		else{
			x = xv2.y - xv1.x;
		}
		
		if(center1.y < center2.y){
			y = yv2.x - yv1.y;
		}
		else{
			y = yv2.y - yv1.x;
		}
		
		return new Vector2(x, y);
	}
	
	public float adjustCollisionX(){
		xv1 = new Vector2(wall.x, wall.x + wall.width);
		xv2 = new Vector2(collider.x, collider.x + collider.width);
		
		c1 = xv1.getCenter();
		c2 = xv2.getCenter();
		
		if(c1 < c2){
			x = xv2.x - xv1.y;
		}
		else{
			x = xv2.y - xv1.x;
		}
		
		return x;
	}
	
	public float adjustCollisionY(){
		yv1 = new Vector2(wall.y, wall.y + wall.height);
		yv2 = new Vector2(collider.y, collider.y + collider.height);
		
		c1 = yv1.getCenter();
		c2 = yv2.getCenter();
		
		if(c1 < c2){
			y = yv2.x - yv1.y;
		}
		else{
			y = yv2.y - yv1.x;
		}
		
		return y;
	}
}
