/* ������� �����, ������� ����� ����������� ��������� ������ 
 * �� ����������� ����� ��������� ��� ��������.
 */

package kostin.tema9;

public class Task9_3 {
	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int imin = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					imin = j;
				}
			}
			if (i != imin) {
				int temp = a[i];
				a[i] = a[imin];
				a[imin] = temp;
			}
		}

		return a;

	}

	public static void prmas(int[] a) {
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static int rand(int a, int b) {
		int x = (int) ((Math.random() * ((b - a) + 1)) + a);
		return x;
	}

	public static void main(String[] args) {
		int[] mas = new int[20];
		for (int i = 0; i < 20; i++) {
			mas[i] = rand(0, 80);
		}
		
		mas = sort(mas);
		prmas(mas);
	}
}
