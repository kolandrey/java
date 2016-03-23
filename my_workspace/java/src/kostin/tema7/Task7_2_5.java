/* Выведите на экран все члены последовательности 2a(n-1)–1, 
 * где a1=2, которые меньше 10000.
 */

package kostin.tema7;

public class Task7_2_5 {

	public static void main(String[] args) {
		int a = 2;
		while (a < 10000) {
			System.out.println(a);
			a = 2 * a - 1;
		}

	}

}
//2*2