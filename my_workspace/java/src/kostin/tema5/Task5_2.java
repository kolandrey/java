/* ������� ���������, ��������� �� ����� �������� ��������������� ���������� ����������� ����� 
 * � ��� ���������� �����.
 */

package kostin.tema5;

public class Task5_2 {

	public static void main(String[] args) {
		int x = (int) ((Math.random() * 899) + 100);
		int a = x / 100;
		int b = x % 100 / 10;
		int c = x % 100 % 10;
		if (a >= b && a >= c)
			System.out.println("� ����� " + x + " ���������� ����� " + a);
		else if (b >= a && b >= c)
			System.out.println("� ����� " + x + " ���������� ����� " + b);
		else
			System.out.println("� ����� " + x + " ���������� ����� " + c);

	}

}
