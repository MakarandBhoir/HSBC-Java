package test06;

import java.util.function.Predicate;

public class Test2 {
	public static void main(String[] args) {
		Predicate<Integer> predicate = (Integer i1) -> {
			if(i1 > 0)
				return true;
			else
				return false;
		};
		
		if(predicate.test(-10)) {
			System.out.println("positive");
		}else {
			System.out.println("negative");
		}
	}
}
