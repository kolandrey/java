package oop_principles;

public abstract class Ñollaborator {
	public static final float MONTH_WORK_HOURS = 160;
	public static final float PERCENT_100 = 1;
	private int monthSalary;
	private int workTime;
	protected String name;
	public int getMonthSalary() {
		return this.monthSalary;
	}

	public int getWorkTime() {
		return this.workTime;
	}

	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public Ñollaborator() {
	}

	/**
	 * 
	 * @param monthSalary
	 * @param workTime
	 */
	public Ñollaborator(int monthSalary, int workTime) {
		this.monthSalary = monthSalary;
		this.workTime = workTime;
	}

	public double percWorkTime() {
		return this.workTime / MONTH_WORK_HOURS;
	}

	abstract public double salary();

	@Override
	public String toString() {
		return "[MonthSalary()=" + getMonthSalary() + ", WorkTime()="
				+ getWorkTime() + ", percWorkTime()=" + percWorkTime() + "]";
	}
}
