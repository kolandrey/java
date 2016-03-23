package ua.kh.lessons.lesson3.dz;

public class Circle extends Object {
	private int x;
	private int y;
	private int rad;

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getRad() {
		return this.rad;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public Circle() {
		this.x = 0;
		this.y = 0;
		this.rad = 0;
	}

	public Circle(int x, int y, int rad) {
		this.x = x;
		this.y = y;
		this.rad = rad;
	}

	public double area() {
		return Math.PI * this.rad * this.rad;
	}

	public double length() {
		return 2 * Math.PI * this.rad;
	}

	public void print() {
		System.out.println(this);
	}

	public boolean isInCircle(int x, int y) {
		double length = Math.sqrt(((x - this.x) * (x - this.x))
				+ ((y - this.y) * (y - this.y)));
		return length < this.rad;
	}

	public boolean isCircleInCircle(Circle c) {
		double ab = Math.sqrt(((c.getX() - this.x) * (c.getX() - this.x))
				+ ((c.getY() - this.y) * (c.getY() - this.y)));
		return (c.getRad() + this.rad > ab);
	}

	@Override
	public String toString() {
		return "x=" + this.x + " y=" + this.y + " rad=" + this.rad;
	}
}
