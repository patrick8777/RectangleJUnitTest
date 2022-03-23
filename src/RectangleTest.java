import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Paddy
 *
 */
public class RectangleTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	// Test kann kein Negatives X
	@Test
	public void canNotCreateNeagativeX() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(-1, 1, 1, 1);// Rechteck werte setzen
	}

	// Test kann kein Negatives Y
	@Test
	public void canNotCreateNeagativeY() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, -1, 1, 1);// Rechteck werte setzen
	}

	// Kann keine neagtive breite
	@Test
	public void canNotCreateNeagativeWidth() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, 1, -1, 1);// Rechteck werte setzen
	}

	// Kann keine neagtive Höhe
	@Test
	public void canNotCreateNeagativeHeight() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, 1, 1, -1);// Rechteck werte setzen
	}

	// Kann keine neagtive 0 X
	@Test
	public void canNotCreateZeroX() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(-0, 1, 1, 1);// Rechteck werte setzen
	}

	// Kann keine neagtive 0 Y
	@Test
	public void canNotCreateZeroY() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, -0, 1, 1);// Rechteck werte setzen
	}

	// Kann keine neagtive 0 breite
	@Test
	public void canNotCreateZeroWidth() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, 1, -0, 1);// Rechteck werte setzen
	}

	// Kann keine neagtive 0 höhe
	@Test
	public void canNotCreateZeroHeight() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, 1, 1, -0);// Rechteck werte setzen
	}

	// Ob Rechteck aufgerufen werden kann.
	@Test
	public void canGet() {
		Rectangle r = new Rectangle(1, 2, 3, 4);// Rechteck werte setzen
		assertEquals(1, r.getX());
		assertEquals(2, r.getY());
		assertEquals(3, r.getWidth());
		assertEquals(4, r.getHeight());
	}

	@Test
	public void canSetPostiv() {
		// 1.Vorbedignung
		Rectangle r = new Rectangle(1, 2, 3, 4);
		// 2.Testaktion durchführen
		r.setWidth(5);
		// 3. Nachbedingungen prüfen
		assertEquals(5, r.getWidth());
		// 2.Testaktion durchführen
		r.setHeight(6);
		// 3. Nachbedingungen prüfen
		assertEquals(6, r.getHeight());
		// 2.Testaktion durchführen
		r.setX(7);
		// 3. Nachbedingungen prüfen
		assertEquals(7, r.getX());
		// 2.Testaktion durchführen
		r.setY(8);
		// 3. Nachbedingungen prüfen
		assertEquals(8, r.getY());
	}

	@Test
	public void canSetNegativeWidth() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, 2, 3, 4);
		r.setWidth(0);
	}

	@Test
	public void canSetNegativeHeight() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, 2, 3, 4);
		r.setHeight(-1);
	}

	@Test
	public void canSetNegativeX() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, 2, 3, 4);
		r.setX(-2);
	}

	@Test
	public void canSetNegativeY() {
		exception.expect(IllegalArgumentException.class);
		Rectangle r = new Rectangle(1, 2, 3, 4);
		r.setY(-3);
	}

	@Test
	public void testMoveUp() {
		// 1.Vorbedignung
		Rectangle r = new Rectangle(1, 2, 3, 4);
		// 2.Testaktion durchführen
		r.moveUp();
		// 3. Nachbedingungen prüfen
		assertEquals(4, r.getHeight());
		assertEquals(3, r.getWidth());
		assertEquals(7, r.getY());
		assertEquals(1, r.getX());
	}

	@Test
	public void testMoveDown() {
		// 1.Vorbedignung
		Rectangle r = new Rectangle(1, 2, 3, 4);
		// 2.Testaktion durchführen
		r.moveDown();
		// 3. Nachbedingungen prüfen
		assertEquals(4, r.getHeight());
		assertEquals(3, r.getWidth());
		assertEquals(2, r.getY());
		assertEquals(1, r.getX());
	}

	@Test
	public void testMoveDown5px() {
		// 1.Vorbedignung
		Rectangle r = new Rectangle(1, 6, 3, 4);
		// 2.Testaktion durchführen
		r.moveDown();
		// 3. Nachbedingungen prüfen
		assertEquals(4, r.getHeight());
		assertEquals(3, r.getWidth());
		assertEquals(1, r.getY());
		assertEquals(1, r.getX());
	}

	@Test
	public void testRectangleIntersect() {
		// 1.Vorbedignung
		Rectangle r = new Rectangle(1, 2, 3, 4);
		Rectangle r2 = new Rectangle(1, 2, 3, 4);
		// 3. Nachbedingungen prüfen
		assertTrue(r.intersect(r2));
	}
}
