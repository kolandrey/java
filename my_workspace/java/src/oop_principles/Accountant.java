package oop_principles;

class Accountant {
	public double calculateSalaries(Collaborator[] array) {
		double sum = 0;
		for (Collaborator s : array) {
			sum += s.salary();
		}
		return sum;
	}
}