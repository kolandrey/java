/*В переменных a и b лежат положительные длины катетов прямоугольного треугольника. 
 * Вычислить и вывести на экран площадь треугольника и его периметр.
 */

package kostin.tema3;

public class Task3_2 {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		double S, p;
		S = 0.5 * x * y;
		p = x + y + Math.sqrt((x * x) + (y * y));
		System.out.println("Площадь - " + S + "\nПериметр - " + p);
	}

}
