/* Создать двумерный массив из 6 строк по 7 столбцов в каждой 
 * из случайных целых чисел из отрезка [0;9]. Вывести массив 
 * на экран. Преобразовать массив таким образом, чтобы на первом 
 * месте в каждой строке стоял её наибольший элемент. При этом 
 * изменять состав массива нельзя, а можно только переставлять 
 * элементы в рамках одной строки. Порядок остальных элементов 
 * строки не важен (т.е. можно соврешить только одну перестановку, 
 * а можно отсортировать по убыванию каждую строку). Вывести 
 * преобразованный массив на экран.
 */

package kostin.tema8;

public class Task_8_2_4 {

	public static void main(String[] args) {
		int[][] mas = new int[6][7];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {

			for (int y = 0; y < mas[i].length; y++) {

				int min = mas[i][y];
				int imin = y; 

				for (int a = y + 1; a < mas[i].length; a++) {

					if (mas[i][a] > min) {
						min = mas[i][a];
						imin = a;
					}
				}

				if (y != imin) {
					int temp = mas[i][y];
					mas[i][y] = mas[i][imin];
					mas[i][imin] = temp;
				}
			}

		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
