/* ������������ ������ � ���������� ����������� ����� ������� 3, 
 * ������� ����������� � ���������� n. ���� ������������ ��� �� 
 * ���������� �����, �� ��������� ������ ������� ������������ 
 * ��������� ����. ������� ������ �� n ��������� ����� ����� �� 
 * ������� [0;n] � ������� ��� �� �����. ������� ������ ������ 
 * ������ �� ������ ��������� ������� �������, ���� ��� ��� ����, 
 * � ������� ��� �� �����.
 */

package kostin.tema8;

import java.util.*;

public class Task8_13 {

	public static void main(String[] args) {
		// Scanner sc = new Scanner (System.in);
		int size;
		System.out.println("������� ����������� ����� ������ 3�");
		while (true) {
			Scanner sc = new Scanner(System.in);

			if (sc.hasNextInt()) {
				size = sc.nextInt();
				if (size > 3) {
					break;
				} else {
					System.out.println("������� ����������� ����� ������ 3�");
				}

			} else {
				System.out.println("������� ����������� ����� ������ 3�");
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
