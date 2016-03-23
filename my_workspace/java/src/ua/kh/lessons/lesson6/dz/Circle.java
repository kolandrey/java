package ua.kh.lessons.lesson6.dz;

public class Circle extends Figure {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle, radius=" + radius + ", area=" + area()
				+ super.toString();
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	public boolean isInside(int x, int y) {
		double length = Math.sqrt(((x - this.getX()) * (x - this.getX()))
				+ ((y - this.getY()) * (y - this.getY())));
		return length < this.getRadius();
	}

	public boolean isInside(Circle c) {
		double length = Math.sqrt(((c.getX() - this.getX()) * (c.getX() - this
				.getX()))
				+ ((c.getY() - this.getY()) * (c.getY() - this.getY())));
		return (c.getRadius() + this.getRadius() > length);
	}

}
