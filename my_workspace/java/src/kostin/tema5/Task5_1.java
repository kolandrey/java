/* ������� ���������, ������� ����� ��������� ������ �� �������� 
 * ��������� �� ������� [5;155] ����� ����� � �������� (25;100) � �������� ��������� �� �����.
 */

package kostin.tema5;

public class Task5_1 {

	public static void main(String[] args) {
		int a = (int) ((Math.random() * 150) + 5);
		if (a >= 25 && a <= 100) {
			System.out.println("����� " + a
					+ " ���������� � ��������� (25,100)");
		} else
			System.out.println("����� " + a
					+ " �� ���������� � ��������� (25,100)");
	}

}
