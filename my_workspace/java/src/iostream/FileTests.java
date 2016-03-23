package iostream;

import java.io.IOException;

public class FileTests {

	public static void main(String[] args) throws IOException {
		// FileView dict1 = new FileView("d:\\");
		// System.out.println(dict1);
		// File file = new File("d:\\");
		// System.out.println(Arrays.toString(new File("d:\\").list()));
		// FileView dict2 = new FileView();
		// dict2.fileView("c:\\");
		// System.out.println(dict2);

		FileCopy.copyByte("D:\\Java_B.djvu", "D:\\J.djvu");
		// FileCopy.copyNIO("D:\\cl.txt", "D:\\cl_copy2.txt");
		// System.out.println(SearchInFile.charInFile("D:\\test.txt", 1));
		//System.out.println(SearchInFile.word("D:\\test2.txt"));
	}

}
