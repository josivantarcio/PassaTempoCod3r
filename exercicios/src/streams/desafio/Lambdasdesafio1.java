package streams.desafio;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdasdesafio1 {
	//if the tires are new
	public static final Predicate<Estoque> newTires = t -> (t.isNewTires() == false);
	
	//if the car of manufacture since 2000
	public static final Predicate<Estoque> since = s -> (s.getSince() >= 2000);
	
	//if car price miner 20000 R$
	public static final Predicate<Estoque> price = p -> (p.getPrice() > 20000);
	
	//message available for sale
	public static final Function<Estoque, String> msg = m -> "Car " + m.getCar() + " available for sale.";
	
	//print the token
	public static final Consumer<String> printing = System.out::println;
	
	
}
