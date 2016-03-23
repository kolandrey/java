/* —оздайте программу, вывод€щую на экран 12 первых элементов 
 * последовательности 2an-2Ц2, где a1=3 и a2=2.
 */

package kostin.tema7;

public class Task7_2_10 {

	public static void main(String[] args) {
		int an;
		int a1 = 3, a2 = 2;
		System.out.println(a1);
		System.out.println(a2);
		for (int i = 1; i < 11; i++) {
			an = (2*a1-2);
			a1 = an;
			an = (2*a2-2);
			a2 = an;
			System.out.println(a1);
			System.out.println(a2);
		}
	}

}




