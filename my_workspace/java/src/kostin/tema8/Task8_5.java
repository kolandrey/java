/* �������� 2 ������� �� 5 ��������� ����� ����� ��
 *  ������� [0;5] ������, �������� ������� �� ����� 
 *  � ���� ��������� �������. ���������� ������� 
 *  �������������� ��������� ������� ������� � ��������, 
 *  ��� ������ �� �������� ��� �������� ��������� 
 *  ������ (���� ��������, ��� �� ������� �������������� �����).
 */

package kostin.tema8;

public class Task8_5 {

	public static void main(String[] args) {
		int mas1[] = new int[5];
		int mas2[] = new int[5];
		double average1 = 0, average2 = 0;
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (int) (Math.random() * 6);
			average1 += mas1[i];
			System.out.print(mas1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = (int) (Math.random() * 6);
			average2 += mas2[i];
			System.out.print(mas2[i] + " ");
		}
		System.out.println();
		average1 = average1 / mas1.length;
		average2 = average1 / mas2.length;
		System.out.println(average1);
		System.out.println(average2);
	}

}
