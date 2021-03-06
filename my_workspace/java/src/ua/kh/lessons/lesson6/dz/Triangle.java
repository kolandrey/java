package ua.kh.lessons.lesson6.dz;

public class Triangle extends Figure {
	private int sideA;
	private int sideB;
	private double sideC;

	public int getSideA() {
		return sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public Triangle() {
		init();
	}

	public Triangle(int x, int y, int sideA, int sideB) {
		super(x, y);
		this.sideA = sideA;
		this.sideB = sideB;
		initSideC();

	}

	@Override
	public String toString() {
		return "Triangle, sideA=" + sideA + ", sideB=" + sideB + ", sideC="
				+ sideC + ", area=" + area() + super.toString() + "]";
	}

	private void init() {
		setX(10);
		setY(10);
		this.sideA = 5;
		this.sideB = 7;
		initSideC();
	}

	private void initSideC() {
		sideC = Math
				.sqrt((this.sideA * this.sideA) + (this.sideB * this.sideB));
	}

	@Override
	public double area() {
		return (0.5 * (this.sideA * this.sideB));
	}

}
