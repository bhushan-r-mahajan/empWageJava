public class empWage {

	public static void main (String[] args) {

		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHour = 20;
		int workHours = 0;

		for (int i = 0; i<20; i++)
		{
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
			int dailyWage = (wagePerHour * workHours);
			System.out.println (dailyWage);
		}
	}
}
