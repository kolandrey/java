/* Выведите на экран все двузначные члены 
 * последовательности 2an-1+200, где a1= –166.
 */

package kostin.tema7;

public class Task7_2_6 {

	public static void main(String[] args) {
		int a = -166;
		while (true){
			
			if (a<=99 & a>=-99) {
				System.out.println(a);
			}
			a = 2*a+200;
			
		}

	}

}
