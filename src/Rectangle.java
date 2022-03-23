
/**
 * @author Paddy
 *
 */
public class Rectangle {
	// Variablen deklariert
	private int x;
	private int y;
	private int width;
	private int height;
	//Konstruktors Rectangle
	public Rectangle(int x, int y, int width, int height) {
		if (1 > x || 1 > y || 1 > width || 1 > height) {
			throw new IllegalArgumentException("Alle Paramenter müssen Postiv sein");
		}
		this.x = x; //Verweis auf x im Rechteck
		this.y = y; //Verweis auf y im Rechteck
		this.width = width;//Verweis auf width im Rechteck
		this.height = height;//Verweis auf height im Rechteck
	}
	// Rechteck boolean zur Überprüfung
	public boolean intersect(Rectangle b) {
		boolean intersect = ((b.width / 2) + (width / 2) < Math.abs(b.x - x)
				&& (b.height / 2) + (height / 2) < Math.abs(b.y - y));
		if (intersect == true)
			return false;
		else
			return true;

	}
	// fragt x return 
	public int getX() {
		return x;
	}
	// setX Wert soll Postiv sein
	public void setX(int x) {
		if (1 > x) {
			throw new IllegalArgumentException("Wert soll Postiv sein");
		}
		this.x = x;
	}
	// fragt y return 
	public int getY() {
		return y;
	}
	// y, Wert soll Postiv sein
	public void setY(int y) {
		if (1 > y) {
			throw new IllegalArgumentException("Wert soll Postiv sein");
		}
		this.y = y;
	}
	// fragt width return 
	public int getWidth() {
		return width;
	}
	// width, Wert soll Postiv sein
	public void setWidth(int width) {
		if (1 > width) {
			throw new IllegalArgumentException("Wert soll Postiv sein");
		}
		this.width = width;
	}
	// fragt height return
	public int getHeight() {
		return height;
	}
	// width, Wert soll Postiv sein
	public void setHeight(int height) {
		if (1 > height) {
			throw new IllegalArgumentException("Wert soll Postiv sein");
		}
		this.height = height;
	}
	
	public void moveUp() {
		y = y + 5;
	}

	public void moveLeft() {
		x += 5;
	}

	public void moveRight() {
		if (5 < x) {
			x -= 5;
		}
	}

	public void moveDown() {
		if (5 < y) {
			y -= 5;
		}
	}
}
