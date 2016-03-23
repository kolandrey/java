package bookshop;

import java.util.Scanner;

public class BookShopRunner {
	public static void main(String[] args) {
		BookShop shop = new BookShop();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String operation;
		System.out.println("Wellcome in BookShop 1.0");
		do {
			System.out.println("Please choose the ooperation.");
			System.out.println("1. add");
			System.out.println("2. del");
			System.out.println("3. sort by name");
			System.out.println("4. search");
			System.out.println("5. print");
			System.out.println("6. save");
			System.out.println("7. load");
			System.out.println("8. exit");

			operation = scanner.next();

			switch (operation) {
			case "1":
				System.out.println("Please, enter book name");
				String name = scanner.next();
				System.out.println("Please, enter author name");
				String author = scanner.next();
				shop.add(new Book(name, author));
				break;
			case "2":
				System.out.println(2);
				break;

			case "3":
				shop.sortByName();
				break;
			case "5":
				System.out.println(shop);
				break;

			default:
				System.out.println("Incorrect input. Please, try again.");
				break;
			}
		} while (!operation.equals("8"));
	}
}