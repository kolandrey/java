/*—оздайте программу, вывод€щую на экран все 
 * неотрицательные элементы последовательности 90 85 80 75 70 65 60 Е.
 */

package kostin.tema7;

public class Task7_2_3 {

	public static void main(String[] args) {
		int a = 90;
		do {
			System.out.println(a);
			a = a - 5;
		} while (a >= 0);
	}

}
