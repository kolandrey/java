package oop_principles;

public class Programmer extends Collaborator {
	
	public Programmer(int monthSalary, int workTime) {
		super(monthSalary, workTime);
	}

	public Programmer() {
		super(2000,0);
	}

	public double salary() {
		return (getMonthSalary() / MONTH_WORK_HOURS) * getWorkTime();
	}

	@Override
	public String toString() {
		return "Programmer [salary()=" + salary() + "]" + super.toString();
	}

}