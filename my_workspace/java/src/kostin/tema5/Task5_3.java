/* � ��� ���������� a, b � c ���� �������� ������������� ��� ����� ������� 
 * �������� ����� ����� �����. ������� ���������, ������� ���������� ����� 
 * � ���������� ����� �������, ����� ��� ������ �� ����� ������������������
 *  a, b � c ��������� ������ ������������.
 */

package kostin.tema5;

public class Task5_3 {

	public static void main(String[] args) {
		int min, mid, max;
		int a = -6;
		int b = 10;
		int c = -3;

		if (a < b && a < c)
			min = a;
		else if (b < a && b < c)
			min = b;
		else
			min = c;

		if (a > b && a > c)
			max = a;
		else if (b > a && b > c)
			max = b;
		else
			max = c;

		if (a > min && a < max)
			mid = a;
		else if (b > min && b < max)
			mid = b;
		else
			mid = c;

		System.out.println(min + " " + mid + " " + max);
	}

}
