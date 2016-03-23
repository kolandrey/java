/* Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
 *  Определите какой элемент является в этом массиве максимальным и 
 *  сообщите индекс его последнего вхождения в массив.
 */

package kostin.tema8;

public class Task8_8 {

	public static void main(String[] args) {
		 int mas[] = new int[12];
		//int mas[] = { 10, 15, -2, 6 };
		int max = 0;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 31) - 15);
			System.out.print(mas[i] + " ");
		}

		for (int j = 1, i = 0;i < mas.length & j<mas.length;j++) {
			if (mas[i]<mas[j]){
				i = j;
				max = j;
			}
		}

		System.out.println();
		System.out.println(max);
	}

}
