/* �������� ��� ������� �� 10 ����� ��������� ����� �� 
 * ������� [1;9] � ������ ������ �� 10 �������������� �����. 
 * ������ ������� � i-�� �������� �������� ������� ������ 
 * ��������� ��������� �������� �� ������� ������� � i-�� 
 * �������� � �������� �� ������� ������� � i-�� ��������. 
 * ������� ��� ��� ������� �� ����� (������ �� ��������� ������), 
 * ����� ������� ���������� ����� ��������� � ������� �������.
 */

package kostin.tema8;

public class Task8_9 {

	public static void main(String[] args) {
		int count = 0;
		int mas1[] = new int[10];
		int mas2[] = new int[10];
		double mas3[] = new double[10];
		for (int i = 0; i < 10; i++) {
			mas1[i] = (int) ((Math.random() * 9) + 1);
			mas2[i] = (int) ((Math.random() * 9) + 1);
			mas3[i] = ((double) mas1[i] / mas2[i]);
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(mas1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(mas2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(mas3[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if ((Math.round(mas3[i]) - mas3[i]) == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
