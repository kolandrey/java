/*��������� ������ ������� ������ �� 12 ��������� ����� 
 * ����� �� ������� [-10;10] ����� �������, ����� ������������� � 
 * ������������� ��������� ��� ���� ������� � �� ���� �����. 
 * ��� ���� ������� ���������� ��������� ������ ���� ������� 
 * (�. �. �� �������� �������, ����� � ������� ��������� �������� 
 * ������� 6 �������������, � ����� 6 ������������� ����� ��� �� 
 * ����� �������� ��������� ���������� ����� ���� � ��.). ������� 
 * ���������� ������ �� �����.
 */

package kostin.tema8;

public class Task8_12 {

	public static void main(String[] args) {
		int mas[] = new int[12];
		int count1 = 0, count2 = 0;
		while (true) {
			for (int i = 0; i < 12; i++) {
				mas[i] = (int) ((Math.random() * 22) - 11);
				if (mas[i] > 0)
					count1++;
				else if (mas[i] < 0)
					count2++;
				else {
					i = 0;
					count1 = 0;
					count2 = 0;
				}
			}
			if (count1 == count2) {
				break;
			} else {
				count1 = 0;
				count2 = 0;
			}

		}
		for (int i = 0; i < 12; i++) {
			System.out.print(mas[i] + " ");
		}

	}

}