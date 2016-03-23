package iostream;

import java.io.File;

public class FileView {
	private String list[];

	public FileView() {
	}

	public FileView(String file) {
		fileView(file);
	}

	public void fileView(String file) {
		File view = new File(file);
		this.list = view.list();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.length; i++) {
			sb.append(list[i]);
			sb.append("\r\n");
		}
		return sb.toString();
	}
}
