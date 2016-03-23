package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class FileCopy {
	private static final String SEPARATOR = "\r\n";

	public static void copyIO(String pathA, String pathB) throws IOException {
		File file = new File(pathB);
		file.delete();
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		BufferedReader reader = new BufferedReader(new FileReader(pathA));
		String str = "";
		while (str != null) {
			str = reader.readLine();
			if (str == null)
				break;
			writer.write(str + SEPARATOR);
		}
		reader.close();
		writer.close();
	}

	public static void copyNIO(String pathA, String pathB) {
		Path from = Paths.get(pathA);
		Path to = Paths.get(pathB);
		try {
			Files.copy(from, to);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Файл уже существует");
		}
	}

	public static void copyStream(String pathA, String pathB)
			throws IOException {
		FileInputStream in = new FileInputStream(pathA);
		try {
			FileOutputStream out = new FileOutputStream(pathB);
			try {
				byte[] buffer = new byte[1024];
				int length = 0;
				while (true) {
					length = in.read(buffer, 0, buffer.length);
					if (length == -1)
						break;
					out.write(buffer, 0, length);
				}
			} finally {
				out.close();
			}
		} finally {
			in.close();
		}
	}

	public static void copyByte(String source, String destination)
			throws IOException {
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(destination);
		int b;
		while (true) {
			b = fis.read();
			if (b == -1)
				break;
			fos.write(b);
		}
		fos.close();
		fis.close();
	}

}
