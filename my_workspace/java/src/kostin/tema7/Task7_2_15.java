/* Электронные часы показывают время в формате от 00:00 до 23:59. 
 * Подсчитать сколько раз за сутки случается так, что слева от 
 * двоеточия показывается симметричная комбинация для той, что 
 * справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */

package kostin.tema7;

public class Task7_2_15 {

	public static void main(String[] args) {
		int count = 0;
		for (int a1 = 0; a1 <=2; a1++){
			for (int a2 = 0; a2 <=3; a2++){
				for (int a3 = 0; a3 <=5; a3++){
					for (int a4 = 0; a4 <=9; a4++){
						if (a1==a4 && a2==a3){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
