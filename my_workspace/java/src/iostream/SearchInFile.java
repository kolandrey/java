package iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class SearchInFile {
	public static char charInFile(String pathA, int line) throws IOException {
		char[] ch;
		BufferedReader in = new BufferedReader(new FileReader(pathA));
		try {

			for (int i = 0; i < line; i++) {
				in.readLine();
			}
			ch = in.readLine().toCharArray();
		} finally {
			in.close();
		}
		int counterMax = 0;
		int counter = 0;
		char max = ch[0];
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					counter++;

				}
			}
			if (counter > counterMax) {
				max = ch[i];
				counterMax = counter;
			}
			counter = 0;
		}

		return max;
	}

	public static String word(String pathA) throws IOException {
		String buffer = null;
		StringBuilder file = new StringBuilder();
		TreeMap<String, Integer> map = new TreeMap<>();
		BufferedReader reader = new BufferedReader(new FileReader(pathA));
		while (reader.ready()) {

			file.append(reader.readLine() + " ");
		}
		StringTokenizer token = new StringTokenizer(file.toString(),
				" \t\n\r,./[]{}1234567890");
		while (token.hasMoreTokens()) {
			buffer = token.nextToken();
			if (map.containsKey(buffer)) {
				int i = map.get(buffer);
				map.replace(buffer, ++i);
			} else {
				map.put(buffer, 1);
			}
		}
		Integer max = map.get(map.firstKey());
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				buffer = entry.getKey();
			}
		}
		reader.close();
		return "Слово " + buffer + "; Количество вхождений - " + max;
	}

}
