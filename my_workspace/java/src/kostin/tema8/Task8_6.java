/* �������� ������ �� 4 ��������� ����� ����� �� ������� 
 * [10;99], �������� ��� �� ����� � ������. ���������� � 
 * ������� �� ����� ��������� � ���, �������� �� ������ 
 * ������ ������������ �������������������.
 */

package kostin.tema8;

public class Task8_6 {

	public static void main(String[] args) {
		boolean up = true;
		int mas[] = new int[4];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 90) + 10);
			System.out.print(mas[i] + " ");
			if (i != 0 && mas[i] < mas[i - 1]) {
				up = false;
			}
		}
		if (up)
			System.out
					.println("�������� ������ ������������ �������������������");
	}
}
