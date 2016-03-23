package ua.kh.lessons.lesson8.dz;

import java.io.*;

public class FileTest {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter write = new OutputStreamWriter(null, "D://Java//workspace2//Files//test1.txt");
		write.write("Hello world");
		write.close();

		FileWriter write2 = new FileWriter(
				"D://Java//workspace2//Files//test2.txt", false);
		String line = "";
		for (int i = 3; i < 18; i += 2) {
			line += i + " ";
		}
		write2.write(line);
		write2.close();
	}

}
