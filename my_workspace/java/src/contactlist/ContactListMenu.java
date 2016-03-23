package contactlist;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ContactListMenu {
	private static final String TXTPATH = "D:\\cl.txt";
	private static final String SERPATH = "D:\\cl.ser";
	private static final String ZIPPATH = "D:\\cl.zip";
	
	public static void run() throws IOException, ClassNotFoundException {
		ContactList list = new ContactList();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String operation;
		System.out.println("Wellcome in ContactList 1.0");
		do {
			System.out.println("Please choose the ooperation.");
			System.out.println("1. add");
			System.out.println("2. del");
			System.out.println("3. sort by name");
			System.out.println("4. print");
			System.out.println("5. save");
			System.out.println("6. load");
			System.out.println("7. exit");

			operation = scanner.next();

			switch (operation) {
			case "1":
				System.out.println("Please, enter Contact name");
				String name = scanner.next();
				System.out.println("Please, enter telefon number");
				String telefon = scanner.next();
				System.out.println("Please, enter birthday (dd.mm.yyyy)");
				String birthday = scanner.next();
				list.add(new Contact(name, telefon, DateTimeHelper
						.formatDate(birthday)));
				break;
			case "2":
				System.out.println("Please, enter contact what would you like to delete");
				String index = scanner.next();
				list.delete(Integer.parseInt(index));
				break;

			case "3":
				list.sortByName();
				break;
			case "4":
				System.out.println(list.toString());
				break;
			case "5":
				list.saveSerializable(SERPATH);
				list.save(TXTPATH);
				list.zip(TXTPATH,ZIPPATH);
				new File(TXTPATH).delete();
				System.out.println("Contacts saved");
				break;
			case "6":
				list.loadSerializable(SERPATH);
			//	list.read(TXTPATH);
				System.out.println("Contacts loaded");
				break;
			case "7":
				System.out.println("Program closed");
				break;
			default:
				if (operation == "7") {

				} else {
					System.out.println("Incorrect input. Please, try again.");
					break;
				}
			}
		} while (!operation.equals("7"));
	}
}
