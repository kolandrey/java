/* В переменной n хранится трёхзначное число. Создайте программу, 
 * вычисляющую и выводящую на экран сумму цифр n.
 */
package kostin.tema1;

public class Task1_5 {

	public static void main(String[] args) {
	int n = 287;
	System.out.println(n/100+n%100/10+n%100%10);
	}

}
