/* � ������� �������� 7 ���� �������� ��������� �����. 
 * ������� ���������, ������� ����������� � ������� �� 
 * ����� ������ � ���������� �������. ��������, ���� 
 * ���� ���� ����� ������: 
 * ������
 * ���������
 * ��������
 * ������� �. �.
 * ������� �. �.
 * ������
 * �����������
 */

package kostin.tema9;

public class Task9_4 {

	public static void main(String[] args) {
		String[] mas = {"������",
				"���������",
				"��������",
				"������� �. �.",
				"������� �. �.",
				"������",
				"�����������"};
		
		for (int i= 0;i<mas.length;i++){
			System.out.println(mas[i]);
		}
		
		for (int i = 0; i<mas.length;i++){
			for (int j = i+1;j<mas.length;j++){
				if(mas[j].compareTo(mas[i])<0){
					String t = mas[i];
					mas[i] = mas[j];
					mas[j] = t;
				}
			}
		}
		System.out.println();
		for (int i= 0;i<mas.length;i++){
			System.out.println(mas[i]);
		}
	}
}
