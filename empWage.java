public class empWage {

	public static void main (String[] args) {

		int isFullTime = 1;
		double attendance = Math.floor(Math.random() * 10) % 2;
		if (attendance == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
