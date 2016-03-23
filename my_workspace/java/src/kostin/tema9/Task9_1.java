/*Создать статический метод, который будет иметь два целочисленных 
 * параметра a и b, и в качестве своего значения возвращать случайное 
 * целое число из отрезка [a;b]. C помощью данного метода заполнить 
 * массив из 20 целых чисел и вывести его на экран.
 */

package kostin.tema9;

public class Task9_1 {
	public static int rand(int a, int b) {
		int x = (int) ((Math.random() * ((b - a) + 1)) + a);
		return x;
	}

	public static void main(String[] args) {
		int[] mas = new int[20];
		for (int i = 0; i < 20; i++) {
			mas[i] = rand(40, 80);
			System.out.print(mas[i] + " ");
		}
	}

}
