/* ������� ��������� ������ �� 8 ����� �� 5 �������� � ������ �� ��������� ����� 
 * ����� �� ������� [10;99]. ������� ������ �� �����.
 */

package kostin.tema8;

public class Task8_2_1 {

	public static void main(String[] args) {
		int[][] da = new int[8][5];
		for (int i = 0; i < da.length; i++) {
			for (int j = 0; j < da[i].length; j++) {
				da[i][j] = (int) ((Math.random() * 91) + 9);
				System.out.print(da[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
