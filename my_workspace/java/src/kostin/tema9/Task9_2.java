/* Создать метод, который будет выводить указанный массив на экран в строку. 
 * С помощью созданного метода и метода из предыдущей задачи заполнить 
 * 5 массивов из 10 элементов каждый случайными числами и вывести все 
 * 5 массивов на экран, каждый на отдельной строке.
 */

package kostin.tema9;

public class Task9_2 {

	public static int rand(int a, int b) {
		int x = (int) ((Math.random() * ((b - a) + 1)) + a);
		return x;
	}

	public static void prmas(int[] a) {
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] mas1 = new int[10];
		int[] mas2 = new int[10];
		int[] mas3 = new int[10];
		int[] mas4 = new int[10];
		int[] mas5 = new int[10];
		for (int i = 0; i < 10; i++) {
			mas1[i] = rand(40, 80);
			mas2[i] = rand(1, 80);
			mas3[i] = rand(34, 99);
			mas4[i] = rand(-5, 5);
			mas5[i] = rand(6, -10);
		}

		prmas(mas1);
		prmas(mas2);
		prmas(mas3);
		prmas(mas4);
		prmas(mas5);
	}

}
