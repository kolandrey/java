/* ������� ���������, ������� ����� �������� �� ����� ������� 
 * �� ������ �� ��� �������� ������������� ������������ �����.
 */

package kostin.tema6;

import java.util.*;

public class Task6_3 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		Scanner x = new Scanner(System.in);

		System.out.print("������� ������ ����� - ");
		if (x.hasNextDouble()) {
			a = Math.abs(x.nextDouble());

			System.out.print("������� ������ ����� - ");
			if (x.hasNextDouble()) {
				b = Math.abs(x.nextDouble());

				System.out.print("������� ������ ����� - ");
				if (x.hasNextDouble()) {
					c = Math.abs(x.nextDouble());
				} else
					System.out.println("�������...");
			} else
				System.out.println("�� �� ������. ��?");
		} else
			System.out.println("�� ���� ����� ����!");

		// System.out.println(a+" "+b+" "+c);

		if (a < b && a < c)
			System.out.println("������� �� ������ - " + a);
		else if (b < a && b < c)
			System.out.println("������� �� ������ - " + b);
		else
			System.out.println("������� �� ������ - " + c);
	}

}
