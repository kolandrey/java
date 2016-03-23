package oop_principles;

class Accountant {
	public double calculateSalaries(Ñollaborator[] array) {
		double sum = 0;
		for (Ñollaborator s : array) {
			sum += s.salary();
		}
		return sum;
	}
}