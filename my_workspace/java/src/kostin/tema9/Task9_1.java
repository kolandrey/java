/*������� ����������� �����, ������� ����� ����� ��� ������������� 
 * ��������� a � b, � � �������� ������ �������� ���������� ��������� 
 * ����� ����� �� ������� [a;b]. C ������� ������� ������ ��������� 
 * ������ �� 20 ����� ����� � ������� ��� �� �����.
 */

package kostin.tema9;

public class Task9_1 {
	public static int rand(int a, int b) {
		int x = (int) ((Math.random() * ((b - a) + 1)) + a);
		return x;
	}

	public static void main(String[] args) {
		int[] mas = new int[20];
		for (int i = 0; i < 20; i++) {
			mas[i] = rand(40, 80);
			System.out.print(mas[i] + " ");
		}
	}

}
