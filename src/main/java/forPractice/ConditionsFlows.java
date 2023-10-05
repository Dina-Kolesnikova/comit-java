package forPractice;

public class ConditionsFlows {

	public static void main(String[] args) {
		
		
		int year = 20100;
		int year2 = 2020;
		
		if (year <= year2) {
			System.out.println("Do this");
		} else {
			System.out.println("--- It's about 'for' ---");
			System.out.println("Do that");
			System.out.println("--------------------------");
			System.out.println();
		}
		
		int year3 = 2030;
		int year4 = 2040;
		System.out.println(year3 <= year4 ? "Year 3 is smaller than Year 4" : "It's not true");
		System.out.println("-------------------------------");
		System.out.println();
		
		

	}

}
