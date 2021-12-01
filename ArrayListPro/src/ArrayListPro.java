import java.awt.List;
import java.util.*;

public class ArrayListPro {

	public static void main (String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
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
		
		System.out.println( "Using For loop" );
		int max = 0;
		for	(int i = 0; i<list.size();i++) {
			if(max < list.get(i).getSalary()) {
				max = list.get(i).getSalary();
			}	
		}
		System.out.println( max );
		
		System.out.println( "Using while loop" );
		max = 0;
		int i = 0;
		while	(i<list.size()) {
			if(max < list.get(i).getSalary()) {
				max = list.get(i).getSalary();
			}
			i++;
		}
		System.out.println( max );
		
		System.out.println( "Using For-Each loop" );
		max = 0;
		for (Employee e : list) {
			if(max < e.getSalary()) {
				max = e.getSalary();
			}
		}
		System.out.println( max );
		
		System.out.println( "Using iterator loop" );
		max = 0;
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Employee emp = (Employee) it.next();
			if(max < emp.getSalary() ) {
				max = emp.getSalary();
			}
		}
		System.out.println( max );
		
	}
	
	
}


