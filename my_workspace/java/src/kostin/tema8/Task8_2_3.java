/* C������ ��������� ������ �� 7 ����� �� 4 ������� � ������ 
 * �� ��������� ����� ����� �� ������� [-5;5]. ������� ������ 
 * �� �����. ���������� � ������� �� ����� ������ ������ � 
 * ���������� �� ������ ������������� ���������. ���� ����� 
 * ����� ���������, �� ������� ������ ������ ������������� �� ���.
 */
package kostin.tema8;

public class Task8_2_3 {

	public static void main(String[] args) {
		int mas[][] = new int[7][4];
		int mas2[] = new int[7];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) ((Math.random() * 12) - 6);
				System.out.print(mas[i][j] + "\t");
				mas2[i] += Math.abs(mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		int max = mas2[0], imax = 0;
		for (int i = 0; i < mas2.length; i++) {
			if (mas2[i] > max) {
				max = mas2[i];
				imax = i;
			}
		}
		System.out.println(imax);

	}

}
