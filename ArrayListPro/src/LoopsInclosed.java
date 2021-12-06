import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LoopsInclosed {
	
	public LoopsInclosed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void chooseLoop(int choice, List<Employee> list) {
		// TODO Auto-generated constructor stub
		switch(choice) {
			case 1:
				forloop(list);
				break;
			case 2:
				whileloop(list);
				break;
			case 3:
				foreach(list);
				break;
			case 4:
				iterator(list);
				break;
			case 5:
				java8streams(list);
				break;
			case 6:
				java8foreach (list);
				break;
			default:
				System.out.println("Enter valid number");
		}
					
	}
	public static void  forloop(List<Employee> list) {
		System.out.println( "Using For loop" );
		int max = 0;
		for	(int i = 0; i<list.size();i++) {
			if(max < list.get(i).getSalary()) {
				max = list.get(i).getSalary();
			}	
		}
		System.out.println( max );
		
	}
	
	public static void whileloop(List<Employee> list) {
		System.out.println( "Using while loop" );
		int max = 0;
		int i = 0;
		while	(i<list.size()) {
			if(max < list.get(i).getSalary()) {
				max = list.get(i).getSalary();
			}
			i++;
		}
		System.out.println( max );
	}
	
	public static void foreach(List<Employee> list) {
		System.out.println( "Using For-Each loop" );
		int max = 0;
		for (Employee e : list) {
			if(max < e.getSalary()) {
				max = e.getSalary();
			}
		}
		System.out.println( max );
	}
	
	public static void iterator (List<Employee> list) {
		System.out.println( "Using iterator loop" );
		int max = 0;
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee emp = (Employee) it.next();
			if(max < emp.getSalary() ) {
				max = emp.getSalary();
			}
		}
		System.out.println( max );
	}
	
	
	public static void java8foreach (List<Employee> list) {
		System.out.println( "Using java8foreach loop, Finding salaies greater than given value" );
		int val = 100000;
		list.forEach( (Employee)-> { 
			if(val < Employee.getSalary() ) {
				System.out.println(Employee.getName() + " gets " +Employee.getSalary());
			}	
		});		
	}
	
	public static void java8streams (List<Employee> list) {
		System.out.println( "Using java8streams loop, Finding max salry" );
		Comparator<Employee> comparator = Comparator.comparing( Employee::getSalary );
		Employee maxObject = list.stream().max(comparator).get();
		System.out.println(maxObject.getSalary());
	}	

}
