/* �������� ������ �� 8 ��������� ����� ����� �� ������� [1;10]. 
 * �������� ������ �� ����� � ������. �������� ������ ������� � 
 * �������� �������� �� ����. ����� �������� ������ �� ����� �� 
 * ��������� ������.
 */

package kostin.tema8;

public class Task8_4 {

	public static void main(String[] args) {
		int mas[] = new int[8];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 10) + 1);
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		for (int index = 1; index < mas.length; index += 2) {
			mas[index] = 0;
		}
	}

}
