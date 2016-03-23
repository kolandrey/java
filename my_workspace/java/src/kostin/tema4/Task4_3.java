/* В три переменные a, b и c записаны три вещественных числа. 
 * Создать программу, которая будет находить и выводить на экран 
 * вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
 */

package kostin.tema4;

public class Task4_3 {

	public static void main(String[] args) {
		double a = 3;
		double b = 11;
		double c = 7;
		double D;
		if (a == 0)
			System.out.println("Ишь чё захотел!");
		else {
			D = (b * b) - 4 * a * c;
			if (D < 0) {
				System.out.println("Корней нет!");
			}
			else if (D > 0) {
				double x = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
				double y = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
				System.out.println("Первый корень = " + x);
				System.out.println("Второй корень = " + y);
			} else {
				double x = (-(b / 2 * a));
				System.out.println("Корень один = " + x);
			}
		}

	}

}
