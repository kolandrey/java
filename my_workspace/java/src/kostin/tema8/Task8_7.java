/* �������� ������ �� 20-�� ������ ����� ��������� 
 * � �������� ��� �� �����. ����������, ��� ������ 
 * � ������ ����� ������������������ ����� ��������, 
 * � ������ ��������� � ����� ���� ����������.
 */

package kostin.tema8;

public class Task8_7 {

	public static void main(String[] args) {
		int mas[] = new int[20];
		for (int i = 0, fib1 = 0, fib2 = 1; i < mas.length; i++) {
			mas[i] = fib1 + fib2;
			fib2 = fib1;
			fib1 = mas[i];
			System.out.print(mas[i] + " ");
		}
	}
}
