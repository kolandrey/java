/* ������� ���������, ������� ����� ��������� � �������� �� ����� 
 * ����� ���� ����� �����, �������� �������������. ���� ������������ 
 * ����������� ����� ���� �� ���� �� �����, �� �������� �� ������.
 */

package kostin.tema6;

import java.util.*;

public class Task6_2 {

	public static void main(String[] args) {
		// ������ ���������� ���� ����������������?
		int a;
		int b;
		Scanner x = new Scanner(System.in);

		System.out.println("������� ������ ����� - ");

		if (x.hasNextInt()) {
			a = x.nextInt();

			System.out.println("������� ������ ����� - ");
			if (x.hasNextInt()) {
				b = x.nextInt();
				System.out.println("���� ���� ����� ����� = " + (a + b));
			} else
				System.out.println("��� ���� ����...");
		} else
			System.out.println("��� ���� ����...");
	}

}
