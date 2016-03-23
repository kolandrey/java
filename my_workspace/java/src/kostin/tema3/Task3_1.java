/* Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов 
 * без использования функции Math.toDegrees(n).
 */

package kostin.tema3;

public class Task3_1 {

	public static void main(String[] args) {
		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.cos(Math.toRadians(45)));
		System.out.println(Math.cos(Math.toRadians(40)));
	}
}
