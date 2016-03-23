/* Создать программу, выводящую на экран ближайшее к 10 из двух чисел, 
 * записанных в переменные m и n. 
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */

package kostin.tema4;

public class Task4_2 {

	public static void main(String[] args) {
		double x = 10;
		double m = 8.5;
		double n = 13.45;
		double a = Math.abs(x - m);
		double b = Math.abs(x - n);
		if (a < b) {
			System.out.println("Ближайшее к 10ти число - " + m);
		}
		else if (b < a) {
			System.out.println("Ближайшее к 10ти число - " + n);
		} else {
			System.out.println("Одинаково");
		}
	}

}
