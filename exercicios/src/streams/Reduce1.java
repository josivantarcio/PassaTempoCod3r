package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (i, n) ->  i+n;
		
		var teste1 = nums.stream().reduce(soma).get();
		System.out.println(teste1);
		
		Integer teste2 = nums.stream()
			.filter(n -> n%2 == 0)
			.reduce(soma)
			.get();
		
		System.out.println(teste2);
	}
}
