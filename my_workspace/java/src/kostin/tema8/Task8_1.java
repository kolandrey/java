/* �������� ������ �� ���� ������ ����� �� 2 �� 20 � �������� 
 * �������� ������� �� ����� ������� � ������, ������� ���� 
 * ������� �� ������� ��������, � ����� � ������� (������� ���� 
 * ������� �� ������� ������� ����� ������). ����� ��������� 
 * ������� ���������, ������ �� ����� �������.
 */

package kostin.tema8;

public class Task8_1 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 2;
			System.out.println(num[i]);
		}

		for (int i = 0; i < num.length; i++) {
			//num[i] = (i + 1) * 2;
			System.out.print(num[i] + " ");
		}
		System.out.println();

		int num2[] = new int[10];
		int i = 0, j = 2;
		while (j <= 20) {
			
			num2[i] = j;
			System.out.println(num2[i]);
			i++;
			j +=2;
		}
	}
}