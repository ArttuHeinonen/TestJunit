import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleCollisionTester {

	RectangleCollision rect = new RectangleCollision();
	Vector2 adjust = new Vector2();
	Vector2 result = new Vector2();
	
	@Test
	public void testOverlap(){
		rect.setColliderValues(0, 0, 50, 50);
		rect.setWallValues(25, 25, 50, 50);
		assertEquals(true, rect.doesRectanglesCollide());
	}
	
	@Test
	public void testSameValues(){
		rect.setColliderValues(0, 0, 50, 50);
		rect.setWallValues(0, 0, 50, 50);
		assertEquals(true, rect.doesRectanglesCollide());
	}
	
	@Test
	public void testIntegerFlipValues(){
		rect.setColliderValues(Integer.MAX_VALUE + 100, 0, 300, 300);
		rect.setWallValues(Integer.MIN_VALUE, 0, 300, 300);
		assertEquals(true, rect.doesRectanglesCollide());
	}
	@Test
	public void testEdgeValues(){
		rect.setColliderValues(Integer.MAX_VALUE + 100, 0, 300, 300);
		rect.setWallValues(Integer.MIN_VALUE, 0, 300, 300);
		assertEquals(true, rect.doesRectanglesCollide());
	}
	@Test
	public void testAdjustX(){
		rect.setColliderValues(0, 0, 50, 50);
		rect.setWallValues(40, 40, 50, 50);
		adjust.set(10, 10);
		assertEquals(adjust.x, rect.adjustCollisionX(), 0.2f);
	}
	
	@Test
	public void testAdjustY(){
		rect.setColliderValues(0, 0, 50, 50);
		rect.setWallValues(40, 40, 50, 50);
		adjust.set(10, 10);
		assertEquals(adjust.y, rect.adjustCollisionY(), 0.2f);
	}
}
