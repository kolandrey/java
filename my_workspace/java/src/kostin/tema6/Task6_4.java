/* ������� ���������, ������� ����� ���������, �������� �� ����� �� ���� ����, 
 * �������� �������������, ����������� (�������: ������, ������). ���� 
 * ������� ����� �� �� 5 ����, �� �������� �� ������. ��������� ������ 
 * ��������� ������������ �����, ���� ���� � �� ������������ ������� ������� 
 * ��������. ��������, ����� ������ ��� �����л ������� ����� ������� 
 * ������������.
 */

package kostin.tema6;

import java.util.*;

public class Task6_4 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("������� ����� �� 5 ����");
		String word = x.next();
		if (word.length() == 5) {
			// System.out.println("��");
			if (word.charAt(0) == word.charAt(4)
					&& word.charAt(1) == word.charAt(3)) {
				System.out.println("��� ���������");
			} else
				System.out.println("��� �� ���������");
		} else
			System.out.println("������� ������ ��� ������ ����");
		x.close();
	}

}
