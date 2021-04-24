public class empWage {

	public static void main (String[] args) {

		int isFullTime = 1;
		int wagePerHour = 20;
		int workHours = 0;
		double attendance = Math.floor(Math.random() * 10) % 2;
		if (attendance == 1){
			System.out.println("Employee is Present");
			workHours = 8;
			}
		else{
			System.out.println("Employee is Absent");}

		int dailyWage = (wagePerHour * workHours);
		System.out.println (dailyWage);
	}
}
