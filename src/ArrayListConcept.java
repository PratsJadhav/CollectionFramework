import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String args[])
	{
		
		//size is fixed
		
		int a[] = {1,3,2};
		int ab[] = new int[3];
		int abc[];
		int []bc = {3,2,3};
	
		//dynamic size
		//allow random access
		//synchronized
		ArrayList array = new ArrayList();
		array.add(4);
		array.add(3);
		//System.out.println(""+array.size());
		array.add(0, 10);
		//System.out.println(""+array.get(1));
		ArrayList array1 = new ArrayList();
		array1.add(22);
		array1.add(33);
		
		
		array.addAll(array1);
		array.remove(2);
		array.retainAll(array1);
		//to print all values, use for loop
		for(int i=0; i < array.size();i++)
			System.out.println(""+array.get(i));
		
		//generic vs non generic - 
		ArrayList<String> array22 = new ArrayList<String>();
		ArrayList<Boolean> array2 = new ArrayList<Boolean>();
		ArrayList<E> array3 = new ArrayList<E>();
		
		Employee e1 = new Employee("aa", 10);
		Employee e2 = new Employee("bb", 20);
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		
		
		Iterator<Employee> iterator = emp.iterator();
		while(iterator.hasNext())
		{
			Employee emp1 = iterator.next();
			System.out.print(""+emp1.name);
			System.out.println(" and age "+emp1.age);
		}
	}
}
