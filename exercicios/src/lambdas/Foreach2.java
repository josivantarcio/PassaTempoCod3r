package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach2 {
		public static void main(String[] args) {

			List<Integer> valores = Arrays.asList(1,5,6,9,10);
			
			valores.forEach(System.out::println);
			System.out.println();
			valores.forEach(val -> System.out.println(val));
			
			valores.forEach(valor -> numeros(valor));
			System.out.println();
			valores.forEach(Foreach2::numeros);
			
		}
		
		static void numeros(int i) {
			System.out.println("Numeros: " + i);
		}
	
}
