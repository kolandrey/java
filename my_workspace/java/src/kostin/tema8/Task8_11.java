/* ������������ ������ ������� � ���������� ������ 
 * ������������� �����, � ��������� ������ ������� 
 * ������ ���������� ������� �� ��������� ����� ����� 
 * �� [-5;5] � ������� ��� �� ����� � ������. ����� 
 * ����� ��������� ������ ���������� � �������� 
 * ������������ � ���, ����� ������� ����� �������� 
 * ������� ������: ����� ��� ������, ���� ��������, 
 * ��� ��� ����� ������� �����. ���� ������������ 
 * ����� ������������ �����, �� ��������� ������ 
 * ��������� ���������� ����� �� ��� ���, ���� �� 
 * ����� ������� ���������� ��������.
 */

package kostin.tema8;

import java.util.*;

public class Task8_11 {

	public static void main(String[] args) {
		
		int sum1 = 0, sum2 = 0, size = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ������ �����");
		while (true) {
			if (sc.hasNextInt()) {
				size = sc.nextInt();
				if (size % 2 == 0 && size > 0) {
					break;
				} else {
					System.out.println("������� ������ ������������� �����");
				}
			}
		}

		int mas[] = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = (int) ((Math.random() * 12) - 6);
			System.out.print(mas[i] + " ");
		}
		for (int i = 0, j = size / 2; i < size / 2 && j < size; i++, j++) {
			sum1 = sum1+(Math.abs(mas[i]));
			sum2 = sum2+(Math.abs(mas[j]));
		}
		if (sum1>sum2) System.out.println("\n����� �������� ������ "+sum1 );
		else if (sum2>sum1) System.out.println("\n������ �������� ������ "+sum2);
		else System.out.println("\n����� "+sum1);
	}
}
