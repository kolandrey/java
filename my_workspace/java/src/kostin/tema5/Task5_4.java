/* �� ��������� ����������� ������� ������ ������ ����������, �� ����� �������� ������������ 
 * ���������� ������, ���������� �� ����� �������� ���. ����� ������� ���� ���������� ����� � 
 * 9 ����� ���� � ����� ���������� �28800� (�.�. ������� 8 �����), ����� ������� 14:30 � 
 * �� ����� �9000� (�.�. ������� ��� � ��������� ����), � ����� ��������� 17 ����� � 
 * �� ����� ������������ �0� (�.�. ������� ���� ����������).
 * ����������� ������ �������, ��� �������� ������� ���������� � �� �������� ��������� �������
 *  �������� ��� � ��������. ������ �������� ������ ����������� � �������� ���������, �������
 *   ������ ������ ����� �������� �� ����� �������� ����� � ����������� � ���, ������� ������
 *    ����� �������� �� ����� �������� ���. ��������: ��������� 7 �����, ��������� 4 ����, 
 *    �������� 1 ���, ��������� ����� ����.
����, � ���������� n ������ ������������ ��������� (�� ����� ������������ ���������) 
����� ����� �� [0;28800], ����� ��� ������ ���������� �� ����� (��� �������) � �� 
��������� ������ (��� ���������) ������ ���������� ����� � ���������� ������ �����, 
������������ � n ��������.

 */

package kostin.tema5;

public class Task5_4 {

	public static void main(String[] args) {
		int sec = (int) (Math.random() * 28800);
		System.out.println(sec);

		int hours = sec/3600;
		System.out.println(hours);
		
//		if (sec < 3600) {
//			System.out.println("�������� ����� ����");
//		} else if (sec >= 3600 && sec < 7200) {
//			System.out.println("������� 1 ���");
//		} else if (sec >= 7200 && sec < 10800) {
//			System.out.println("�������� 2 ����");
//		} else if (sec >= 10800 && sec < 14400) {
//			System.out.println("�������� 3 ����");
//		} else if (sec >= 14400 && sec < 18000) {
//			System.out.println("�������� 4 ����");
//		} else if (sec >= 18000 && sec < 21600) {
//			System.out.println("�������� 5 �����");
//		} else if (sec >= 21600 && sec < 25200) {
//			System.out.println("�������� 6 �����");
//		} else if (sec >= 25200 && sec < 28800) {
//			System.out.println("�������� 7 �����");
//		}
	}

}