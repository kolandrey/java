package ua.kh.lessons.lesson6.dz;

public class Rectangle extends Figure {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Rectangle() {
	}

	public Rectangle(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Rectangle, side=" + side + ", area=" + area()
				+ super.toString();
	}

	@Override
	public double area() {
		return side * side;
	}

}
