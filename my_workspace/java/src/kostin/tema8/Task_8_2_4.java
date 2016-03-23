/* ������� ��������� ������ �� 6 ����� �� 7 �������� � ������ 
 * �� ��������� ����� ����� �� ������� [0;9]. ������� ������ 
 * �� �����. ������������� ������ ����� �������, ����� �� ������ 
 * ����� � ������ ������ ����� � ���������� �������. ��� ���� 
 * �������� ������ ������� ������, � ����� ������ ������������ 
 * �������� � ������ ����� ������. ������� ��������� ��������� 
 * ������ �� ����� (�.�. ����� ��������� ������ ���� ������������, 
 * � ����� ������������� �� �������� ������ ������). ������� 
 * ��������������� ������ �� �����.
 */

package kostin.tema8;

public class Task_8_2_4 {

	public static void main(String[] args) {
		int[][] mas = new int[6][7];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {

			for (int y = 0; y < mas[i].length; y++) {

				int min = mas[i][y];
				int imin = y; 

				for (int a = y + 1; a < mas[i].length; a++) {

					if (mas[i][a] > min) {
						min = mas[i][a];
						imin = a;
					}
				}

				if (y != imin) {
					int temp = mas[i][y];
					mas[i][y] = mas[i][imin];
					mas[i][imin] = temp;
				}
			}

		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
