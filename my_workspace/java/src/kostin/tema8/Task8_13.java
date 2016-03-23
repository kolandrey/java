/* Пользователь вводит с клавиатуры натуральное число большее 3, 
 * которое сохраняется в переменную n. Если пользователь ввёл не 
 * подходящее число, то программа должна просить пользователя 
 * повторить ввод. Создать массив из n случайных целых чисел из 
 * отрезка [0;n] и вывести его на экран. Создать второй массив 
 * только из чётных элементов первого массива, если они там есть, 
 * и вывести его на экран.
 */

package kostin.tema8;

import java.util.*;

public class Task8_13 {

	public static void main(String[] args) {
		// Scanner sc = new Scanner (System.in);
		int size;
		System.out.println("Введите натуральное число больше 3х");
		while (true) {
			Scanner sc = new Scanner(System.in);

			if (sc.hasNextInt()) {
				size = sc.nextInt();
				if (size > 3) {
					break;
				} else {
					System.out.println("Введите натуральное число больше 3х");
				}

			} else {
				System.out.println("Введите натуральное число больше 3х");
//				System.out.print(" "); 
			}
		}
		int mas[] = new int[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			mas[i] = (int) (Math.random() * size);
			System.out.print(mas[i] + " ");
			if (mas[i] % 2 == 0 && mas[i] != 0) {
				count++;
			}
		}
		System.out.println("\n" + count);
		int mas2[] = new int[count];
		for (int i = 0, j =0; i < size; i++) {
			if (mas[i] % 2 == 0 && mas[i] != 0) {
				mas2[j] = mas[i];
				System.out.print(mas2[j]+" ");
				j++;
			}
		}
//		for (int i=0; i<count; i++){
//			System.out.print(mas2[i]+" ");
//		}
	}
}
