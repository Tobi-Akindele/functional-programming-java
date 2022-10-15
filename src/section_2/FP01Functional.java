package section_2;

import java.util.List;
import java.util.function.Predicate;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(12,3,4,5,6,7,8,9);
		printAll(numberList);
		
		Predicate<Integer> condition = n -> n % 2 == 0;
		System.out.println("Print Even Numbers:");
		printAll(numberList, condition);
	}
	
	private static void printAll(List<Integer> numberList) {
		System.out.println("Option 1:");
		numberList.stream().forEach(System.out::println); // Option 1
		System.out.println("\nOption 2:");
		numberList.stream().forEach(number -> System.out.println(number)); // Option 2
	}
	
	// Filter
	private static void printAll(List<Integer> numberList, Predicate<Integer> condition) {
		numberList.stream()
			.filter(condition)
			.forEach(System.out::println);
	}
}
