package zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.JOptionPane;

public class Zip {
	private List<String> fileList;
	private boolean isFile = false;

	public Zip() {
		fileList = new ArrayList<String>();
	}

	public void zipIt(String outputZipFile, String source) {

		byte[] buffer = new byte[1024];
		
		generateFileList(new File(source));
		if (new File(source).isFile()) {
			isFile = true;
		}
		try {
			FileOutputStream fos = new FileOutputStream(outputZipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);

			for (String file : this.fileList) {
				ZipEntry ze = new ZipEntry(file);
				zos.putNextEntry(ze);
				FileInputStream in = null;
				if (isFile) {
					in = new FileInputStream(source);
				} else {
					try {
						in = new FileInputStream(source + File.separator + file);
					} catch (FileNotFoundException e) {
						JOptionPane.showMessageDialog(null, "Папка не должна содержать вложеных папок");
					}
				}
				int len;
				while ((len = in.read(buffer)) > 0) {
					zos.write(buffer, 0, len);
				}
				in.close();
			}
			zos.closeEntry();
			zos.close();
			JOptionPane.showMessageDialog(null, "Готово");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void generateFileList(File file) {

		if (file.isFile()) {
			fileList.add(file.getName());
		}

		if (file.isDirectory()) {
			String[] subNote = file.list();
			for (String filename : subNote) {
				generateFileList(new File(file, filename));
			}
		}

	}
}