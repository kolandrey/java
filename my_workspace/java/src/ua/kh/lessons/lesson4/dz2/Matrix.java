package ua.kh.lessons.lesson4.dz2;

public class Matrix {
	private double[][] array;

	public Matrix() {
		this.array = new double[3][3];
	}

	public Matrix(double[][] array) {
		this.array = array;
	}

	public void fill(int number) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = number;
			}
		}
	}

	@Override
	public String toString() {

		String string = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				string += (array[i][j] + "\t");
			}
			string += "\n";
		}
		return string;
	}

	public void transponse() {
		int height = array.length;
		int width = array[0].length;
		double[][] array2 = new double[width][height];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array2[j][i] = array[i][j];
			}
		}
		this.array = array2;
	}

	public void sum(Matrix a1) {
		if (array.length == a1.array.length
				&& array[0].length == a1.array[0].length) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] += a1.array[i][j];
				}
			}
		} else {
			throw new IncorrectMatrixSizeException("WTF!!!");
		}
	}

	public void multiply(double number) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] *= number;
			}
		}
	}
}
