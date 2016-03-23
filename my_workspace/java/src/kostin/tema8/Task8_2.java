/* —оздайте массив из всех нечЄтных чисел от 1 до 99, 
 * выведите его на экран в строку, а затем этот же массив 
 * выведите на экран тоже в строку, но в обратном пор€дке 
 * (99 97 95 93 Е 7 5 3 1).
 */

package kostin.tema8;

public class Task8_2 {

	public static void main(String[] args) {

		int start = 1;
		int end = 99;

		int counter = (start + end) / 2;
		
		int mas[] = new int[counter];
		for (int i = start, j = 0; i <= end || j < mas.length; i += 2, j++) {
			mas[j] = i;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		for (int i = mas.length - 1; i >= 0; i--) {
			System.out.print(mas[i] + " ");
		}

	}
}
