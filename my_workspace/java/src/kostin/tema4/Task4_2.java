/* ������� ���������, ��������� �� ����� ��������� � 10 �� ���� �����, 
 * ���������� � ���������� m � n. 
 * ��������, ����� ����� 8,5 � 11,45 ��������� � ������ 11,45.
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
			System.out.println("��������� � 10�� ����� - " + m);
		}
		else if (b < a) {
			System.out.println("��������� � 10�� ����� - " + n);
		} else {
			System.out.println("���������");
		}
	}

}
