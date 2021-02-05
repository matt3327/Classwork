import java.util.Scanner;
public class CollegeAdminApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeAcc sc = null;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Select a shape:");
		System.out.println("1 | Administration Department");
		System.out.println("2 | Finance Department");
		System.out.println("3 | Examination Department");
			
		while(true)
		{
			System.out.println("Enter Choice");
			int choice = myObj.nextInt();
			
			switch(choice)
			{
			case 1 : 
				sc = new AdminDep(123,"Henry Johnson","123 park ln", "Latino-Caucasian","M");
				String str = sc.toString();
				System.out.println(str);
				break;
			case 2 : 
				sc = new FinanceDep(123,"Henry Johnson", 40000,10000,10000,15000);
				String str1 = sc.toString();
				System.out.println(str1);
				break;
			case 3 : 
				sc = new ExaminationDep(123,"Henry Johnson",32,3.21);
				String str2 = sc.toString();
				System.out.println(str2);
				break;
			default :
				System.out.println("ERROR: incorrect number input");
				break;
				
			}
			
			System.out.println(""); //Provides space between each loop of the run
		}
	}

}
