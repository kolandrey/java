/* Создать двумерный массив из 5 строк по 8 столбцов в каждой 
 * из случайных целых чисел из отрезка [-99;99]. Вывести массив 
 * на экран. После на отдельной строке вывести на экран значение 
 * максимального элемента этого массива (его индекс не имеет значения).
 */

package kostin.tema8;

public class Task8_2_2 {

	public static void main(String[] args) {
		int mas[][] = new int[5][8];
		int max = mas[0][0];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) ((Math.random() * 200) - 100);
				System.out.print(mas[i][j] + "\t");
				if (mas[i][j] > max)
					max = mas[i][j];
			}
			System.out.println();
		}
	System.out.println();
	System.out.println(max);
	}

}
