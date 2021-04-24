public class empWage {

	public static void main (String[] args) {

		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHour = 20;
		int workHours = 0;
		double attendance = Math.floor(Math.random() * 10) % 3;
		switch ((int) attendance ) {
			case 1:
				System.out.println("Employee is Full Time");
				workHours = 8;
				break;
			case 2:
				System.out.println("Employee is Part Time");
				workHours = 4;
				break;
			default:
			System.out.println("Employee is Absent");
		}

		int dailyWage = (wagePerHour * workHours);
		System.out.println (dailyWage);
	}
}
