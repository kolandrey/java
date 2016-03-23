/* Натуральное положительное число записано в переменную n. 
 * Определить и вывести на экран, сколько цифр в числе n
 */

package kostin.tema3;

public class Task3_3 {

	public static void main(String[] args) {
		int n = 343525436;
//		System.out.println(Math.round(Math.log10(n)));
		String x = String.valueOf(n);
		int t = x.length();
		
		System.out.println(String.valueOf(n).length());
	}
}
