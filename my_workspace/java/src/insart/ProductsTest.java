package insart;

public class ProductsTest {

	public static void main(String[] args) {
		/*Tent t1 = new Tent();
		t1.setName("Fjord Nansen");
		System.out.println(t1);
		Backpack b1 = new Backpack();
		System.out.println(b1);
		Tent t2 = new Tent("Redpoint", 300, 3, "grey");
		System.out.println(t2);
		System.out.println(Tent.avrPrice());
		Container c = new Container();
		c.add(t1);
		c.add(t2);
		c.add(b1);
		System.out.println(c);
		c.sortContainer();
		System.out.println(c);*/
		Products t1 = new Tent("Marmot", 500, 2, "red");
		Tent t2 = new Tent("Redpoint", 200, 3, "green");
		Backpack b1 = new Backpack("Osprey", 600, 50, "turism");
		Container c = new Container();
		c.add(t1);
		c.add(t2);
		c.add(b1);
		System.out.println(c);
		System.out.println(Tent.avrPrice());
		c.sortContainer();
		System.out.println(c);
		
	}

}