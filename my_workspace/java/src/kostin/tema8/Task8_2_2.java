/* ������� ��������� ������ �� 5 ����� �� 8 �������� � ������ 
 * �� ��������� ����� ����� �� ������� [-99;99]. ������� ������ 
 * �� �����. ����� �� ��������� ������ ������� �� ����� �������� 
 * ������������� �������� ����� ������� (��� ������ �� ����� ��������).
 */

package kostin.tema8;

public class Task8_2_2 {

	public static void main(String[] args) {
		int mas[][] = new int[5][8];
		int max = mas[0][0];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) ((Math.random() * 200) - 100);
				System.out.print(mas[i][j] + "\t");
				if (mas[i][j] > max)
					max = mas[i][j];
			}
			System.out.println();
		}
	System.out.println();
	System.out.println(max);
	}

}
