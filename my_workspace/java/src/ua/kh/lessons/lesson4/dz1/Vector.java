package ua.kh.lessons.lesson4.dz1;

public class Vector<T extends Object> {
	private static final int DEFAULT_LENGTH = 5;
	private T[] array;
	private int size;

	public Vector() {
		init();
	}

	@SuppressWarnings("unchecked")
	private void init() {
		size = 0;
		array = (T[]) new Object[DEFAULT_LENGTH];
	}

	public void add(T obj) {
		if (size == array.length) {
			increase();
		}
		array[size++] = obj;
	}

	public void add(T obj, int index) {
		if (index < 0 || index >= size) {
			throw new IncorrectIndexException();
		}
		if (size == array.length)
			increase();
		for (int i = size - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		array[index] = obj;
		size++;
	}

	public T get(int index) {
		return array[index];
	}

	public void del(int index) {
		for (int i = index; i < array.length - 1; i++) {
			array[index] = array[index + 1];
			index++;
		}
		size--;
	}

	@SuppressWarnings("unchecked")
	private void increase() {
		T[] array2 = (T[]) new Object[this.array.length + DEFAULT_LENGTH];
		for (int i = 0; i < this.array.length; i++) {
			array2[i] = this.array[i];
		}
		this.array = array2;
	}

	@Override
	public String toString() {
		StringBuilder line = new StringBuilder();
		for (int i = 0; i < this.size; i++) {
			line.append(array[i] + " ");
		}
		return line.toString();
	}

	public void clear() {
		init();
	}
}
