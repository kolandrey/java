/*�������� �� ����� ��� ������������� �������� 
 * ������������ �����, ��������� ������������� � ����������.
 */

package kostin.tema7;

import java.util.*;

public class Task7_2_8 {

	public static void main(String[] args) {
		int digit, i, a;
		Scanner x = new Scanner(System.in);
		System.out.print("������� ����������� ����� -  ");
		if (x.hasNextInt()) {
			digit = x.nextInt();
			for (i = 1; i <= digit; i++) {
				if (digit % i == 0) {

					System.out.print(i+ " ");
				}
			}
		}

	}

}
