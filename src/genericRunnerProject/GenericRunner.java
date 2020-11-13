package genericRunnerProject;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {
	
	static <X> X getValue(X value) {
		return value;
	}
	
	static double sumNumberOflist(List<? extends Number> numbers) {
		double sum=0.0;
		
		for (Number db: numbers) {
			sum+=db.doubleValue();
		}
		return sum;

	}
	
	static void lowerBound(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(23.22);
		numbers.add(1l);

	}
	
	
	public static void main(String[]args) {
		myCustomList<String> list1 = new myCustomList<>();
		list1.addElement("element1");
		list1.addElement("element2");
		String value1 = list1.get(0);
		System.out.println(value1);
	
		myCustomList<Integer> list2 = new myCustomList<>();
		list2.addElement(23);
		list2.addElement(34);
		Integer value2 = list2.get(0);
		System.out.println(value2);
		
		String retrieve  = getValue(new String());
		Integer d = getValue(Integer.valueOf(12));
		Double r = getValue(Double.valueOf(12.33));
		
		
		System.out.println(sumNumberOflist(List.of(23,44,233)));
		
		System.out.println(sumNumberOflist(List.of(3,4,3)));

		List empty= new ArrayList<Number>();
		
		lowerBound(empty);
		
		System.out.print(empty);
		
		
		System.out.println(list2.toString());
		
	}
}
