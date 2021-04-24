public class empWage {

	public static void main (String[] args) {

		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHour = 20;
		int workHours = 0;
		int totalWorkHours = 0;
		int totalWorkDays = 0;

		while (totalWorkDays<20 && totalWorkHours<=100)
		{
			totalWorkDays++;
			double attendance = Math.floor(Math.random() * 10) % 3;
			switch ((int) attendance )
			{
				case 1:
					System.out.println("Employee is FullTime");
					workHours = 8;
					break;
				case 2:
					System.out.println("Employee is PartTime");
					workHours = 4;
					break;
				default:
					System.out.println("Employee is Absent");
					workHours = 0;
					break;
			}
			totalWorkHours = (totalWorkHours + workHours);
			int dailyWage = (wagePerHour * workHours);
			System.out.println ("Daily wage for employee is:-" + dailyWage);
			System.out.println ("Total Working Hours of Employee is:-" + totalWorkHours + " and total working days is :-" + totalWorkDays);
		}
		int totalWage = (totalWorkHours * wagePerHour);
		System.out.println ("The total wage for employee is:-" + totalWage);
	}
}

