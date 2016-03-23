/* Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
 * Выведите массив на экран. Подсчитайте сколько в массиве чётных 
 * элементов и выведете это количество на экран на отдельной строке.
 */

package kostin.tema8;

public class Task8_3 {

	public static void main(String[] args) {
		int counter = 0;
		int mas[] = new int[15];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10);
			System.out.print(mas[i] + " ");
			if (mas[i] % 2 == 0 && mas[i] != 0) {
				counter++;
			}
		}
		System.out.println();
		System.out.println(counter);

	}
}
