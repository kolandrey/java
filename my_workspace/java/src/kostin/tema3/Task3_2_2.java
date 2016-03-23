/* Натуральное положительное число записано в переменную n. 
 * Создайте программу, которая будет генерировать и выводить
 *  на экран целое псевдослучайное число из отрезка [-n;n].
 */
package kostin.tema3;

public class Task3_2_2 {

	public static void main(String[] args) {
		int n = 17;
		System.out.println((int) (Math.random() * (2 * n) + 1) - n);

	}

}
