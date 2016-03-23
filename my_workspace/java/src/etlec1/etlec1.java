package etlec1;

public class etlec1 {
	/**
	 * Method return greatest common divider for 2 positive numbers (by Euclid
	 * method)
	 * 
	 * @param a
	 *            number1
	 * @param b
	 *            number2
	 */
	public static int gcd(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	/**
	 * Method return sum of digits random integer number;
	 * 
	 * @param a
	 *            number
	 * @return sum
	 */
	public static int summa(int a) {
		int b = 0;
		while (a != 0) {
			b += a % 10;
			a = a / 10;
		}
		return b;
	}

	/**
	 * Method returns boolean value, whether a number simple or not;
	 * 
	 * @param number
	 *            number
	 * @return "true" if number is simple, "false" if it's not;
	 */
	public static boolean isSimple(int number) {
		boolean check = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}

	/**
	 * Method returns a factorial of a number;
	 * 
	 * @param a
	 *            number
	 * @return factorial of a number;
	 */
	public static long fact(int a) {
		long fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = i * fact;
		}
		return fact;

	}

	/**
	 * Method return a sum of the series 1! - 2! + 3! – 4! + 5! - … + n! for n >
	 * 0.
	 * 
	 * @param n
	 *            a finite number of series;
	 * @return 1! - 2! + 3! – 4! + 5! - … + n!
	 */
	public static long sumSer(int n) {
		long pos = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				pos += fact(i);
			} else {
				pos -= fact(i);
			}
		}
		return pos;
	}

	/**
	 * Method return a count of how many six-digit numbers have the same amount
	 * of the first three and the last three digits;
	 * 
	 * @return integer;
	 */
	public static int six() {
		int count = 0;
		for (int a1 = 0; a1 < 10; a1++) {
			for (int a2 = 0; a2 < 10; a2++) {
				for (int a3 = 0; a3 < 10; a3++) {
					for (int a4 = 0; a4 < 10; a4++) {
						for (int a5 = 0; a5 < 10; a5++) {
							for (int a6 = 0; a6 < 10; a6++) {
								if (a1 + a2 + a3 == a4 + a5 + a6) {
									count++;
								}
							}
						}
					}
				}
			}
		}
		return count;
	}

	/**
	 * Method returns array of the first 20 numbers of Fibonacci series;
	 * 
	 * @return
	 */
	public static int[] fib() {
		int[] mas = new int[20];
		for (int i = 0, fib1 = 0, fib2 = 1; i < mas.length; i++) {
			int fib = fib1 + fib2;
			mas[i] = fib;
			fib2 = fib1;
			fib1 = fib;
		}
		return mas;
	}

	/**
	 * Method print an array in line to console;
	 * 
	 * @param array
	 *            array;
	 */
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Method return an array of 100 elements filled simple numbers;
	 * 
	 * @return array;
	 */
	public static int[] simpleMas() {
		int[] mas = new int[100];
		int j = 2, i = 0;
		while (mas[99] == 0) {
			if (isSimple(j)) {
				mas[i] = j;
				i++;
			}
			j++;
		}
		return mas;
	}

	/**
	 * Method print a two-dimensional array in line to console;
	 * 
	 * @param array
	 *            array;
	 */
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Method print a two-dimensional array in line to console;
	 * 
	 * @param array
	 *            array;
	 */
	public static void print(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Method return a two-dimensional array filled "Ч" and "Б" letters in
	 * staggered;
	 * 
	 * @return a two-dimensional array;
	 */
	public static char[][] chessMas() {
		char[][] mas = new char[10][10];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((i + j) % 2 == 0) {
					mas[i][j] = 'Ч';
				} else {
					mas[i][j] = 'Б';
				}
			}
		}
		return mas;
	}

	/**
	 * Method create a six-dimensional array with two values in each dimension
	 * filled an array numbers from the beginning of the natural numbers 1, 2, 3
	 * 
	 * @return returned how many number it takes;
	 */
	public static int sixMas() {
		int count = 1;
		int[][][][][][] mas = new int[2][2][2][2][2][2];
		for (int a = 0; a < mas.length; a++) {
			for (int b = 0; b < mas[a].length; b++) {
				for (int c = 0; c < mas[a][b].length; c++) {
					for (int d = 0; d < mas[a][b][c].length; d++) {
						for (int e = 0; e < mas[a][b][c][d].length; e++) {
							for (int f = 0; f < mas[a][b][c][d][e].length; f++) {
								mas[a][b][c][d][e][f] = count;
								count++;
							}
						}
					}
				}
			}
		}
		return count;

	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

//	public static String printMas(char[][] array) {
//		String str = "{";
//		for (int i = 0; i < array.length; i++) {
//			str += "{";
//			for (int j = 0; j < array[i].length; j++) {
//				if (j == array[i].length - 1) {
//					str += "\'"+array[i][j]+"\'";
//				} else {
//					str += "\'"+array[i][j]+"\'" + ", ";
//				}
//			}
//			str += "} ,";
//		}
//		str += "}";
//		return str;
//	}

	public static void main(String[] args) {
		// System.out.println(gcd(56, 174));
		// System.out.println(summa(0));
		// System.out.println(isSimple(23593));
		// System.out.println(fact(20));
		// System.out.println(sumSer(-10));
		// System.out.println(six());
		// print(fib());
		// print(simpleMas());
//		print(chessMas());
//		System.out.println();
//		System.out.println(printMas(chessMas()));
//		 System.out.println(sixMas());
		System.out.println(isEven(5));

		// TODO оптимизировать методы, написать комментарии к каждому методу,
		// создать аккант на сайте bitbucket.org
		// Schild классы, слайды etlec и agp
	}

}
