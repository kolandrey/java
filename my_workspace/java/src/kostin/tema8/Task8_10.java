/* �������� ������ �� 11 ��������� ����� ����� �� ������� [-1;1], 
 * �������� ������ �� ����� � ������. ���������� ����� ������� 
 * ����������� � ������� ���� ����� � �������� �� ���� ��������� 
 * �� �����. ���� ��� �����-�� �������� ����������� ���������� 
 * ���������� ���, �� �� �������� ������.
 */

package kostin.tema8;

public class Task8_10 {

	public static void main(String[] args) {
		int count1 = 0, count2 = 0, count3 = 0;
		int mas[] = new int[11];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 4) - 2);
			System.out.print(mas[i] + " ");
			if (mas[i] == -1)
				count1++;
			else if (mas[i] == 1)
				count2++;
			else
				count3++;
		}
		if (count1 > count2 && count1 > count3)
			System.out.println("������ ����� -1");
		else if (count2 > count1 && count2 > count3)
			System.out.println("������ ����� 1");
		else if (count3 > count1 && count3 > count2)
			System.out.println("������ ����� 0");
	}

}
