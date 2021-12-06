
import java.util.*;

public class ArrayListPro {

	public static void main (String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Ram", 23, 100000));
		list.add(new Employee("Laxaman", 21, 64753));
		list.add(new Employee("Sita", 34, 875863));
		list.add(new Employee("Gita", 26, 6842));
		list.add(new Employee("Niraj", 56, 8475));
		list.add(new Employee("Dhiraj", 23, 73641));
		list.add(new Employee("Sunita", 76, 75863));
		list.add(new Employee("Rahul", 37, 98675));
		list.add(new Employee("Jai", 52, 974863));
		list.add(new Employee("Veeru", 64, 52642));
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("Choose loop by pressing corresponding numbers.\n"
					+ "1. For loop\n"
					+ "2. while loop\n"
					+ "3. for-each loop\n"
					+ "4. Iterator loop\n"
					+ "5. java8 streams\n"
					+ "6. java8 for-each\n"
					+ "Enter 0 to exit\n");
			int Choice = sc.nextInt();
			if(Choice == 0) {
				break;
			}
			else {
				LoopsInclosed.chooseLoop(Choice,list);
			}
		}		
	}
}


