/* —оздать программу, провер€ющую и сообщающую на экран, 
 * €вл€етс€ ли целое число записанное в переменную n, чЄтным либо нечЄтным.
 */

package kostin.tema4;

public class Task4_1 {

	public static void main(String[] args) {
		int n = 57;
		if (n % 2 == 0) {
			System.out.println("„исло n четное - " + n);
		} else
			System.out.println("„исло n нечетное - " + n);
	}

}
