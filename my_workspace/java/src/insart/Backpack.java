package insart;

public class Backpack extends Products {
	private int volume;
	private String type;
	static private int count = 0;
	static private double summa = 0;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Backpack() {
		super("Redpoint", 100);
		this.volume = 75;
		this.type = "extreme";
		count++;
		summa += this.getPrice();
	}

	public Backpack(String name, int price, int volume, String type) {
		super(name, price);
		this.volume = volume;
		this.type = type;
		count++;
		summa += this.getPrice();
	}

	@Override
	public String toString() {
		return "Backpack: " + super.toString() + ", volume=" + volume
				+ ", type=" + type;

	}

	static public double avrPrice() {
		return (double) summa / count;
	}

}
