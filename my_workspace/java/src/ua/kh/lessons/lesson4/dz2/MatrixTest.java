package ua.kh.lessons.lesson4.dz2;

public class MatrixTest {

	public static void main(String[] args) {
		Matrix matrix1 = new Matrix(new double[][] { { 1, 2, 3 }, { 4, 5, 6 } });
		Matrix matrix2 = new Matrix();
		matrix2.fill(1);
		matrix2.multiply(2);
		System.out.println(matrix1);
		// array1.transponse();
		// System.out.println(array1);
		 matrix1.transponse();
		//System.out.println(array2);
		// matrix1.summaMatrix(array2);
		 System.out.println(matrix1);
		// System.out.println(array1);
		System.out.println(matrix2);

//		double arr[][] = new double[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 2, 3 } };
//		Matrix array3 = new Matrix();
//		array3.setArray(arr);
//		array3.transponse();
//		System.out.println(array3);
	}
}
