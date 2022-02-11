package streams.desafio2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasDesafio2 {

	//off30%
	public static final Predicate<Product> discount = d -> d.getDiscount() >= 30;
	
	//free delivery
	public static final Predicate<Product> delivery = d -> d.isFreeDelivery() == true;
	
	//print
	public static final Function<Product, String> msg = m -> 
			"Mega Offer: " + m.getName() 
			+ "\t Price: " + m.getPrice() 
			+ "\t In Stock Only: " + m.getQuantiteStock();
			
	//tocken
	public static final Consumer<String> print = System.out::println;
	 
	
}
