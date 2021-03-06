package oop_principles;

public class Manager extends Collaborator {
	public Manager(int monthSalary, int workTime) {
		super(monthSalary, workTime);
	}

	public Manager() {
		super(1000,0);
	}

	public double salary() {
		if (percWorkTime() >= PERCENT_100) {
			return getMonthSalary();
		} else {
			return getMonthSalary() * percWorkTime();
		}

	}

	@Override
	public String toString() {
		return "Manager [salary()=" + salary() + "]" + super.toString();
	}


}
