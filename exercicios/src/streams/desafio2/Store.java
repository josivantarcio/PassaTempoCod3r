package streams.desafio2;

import java.util.Arrays;
import java.util.List;

public class Store {
	public static void main(String[] args) {
		Product prod1 = new Product("Notebook", 9, 15, 4500.00, true);
		Product prod2 = new Product("Mesa", 25, 30, 450.15, true);
		Product prod3 = new Product("Impressora", 10, 20, 2999.80, true);
		Product prod4 = new Product("Celular", 45, 35, 1500.00, true);
		Product prod5 = new Product("SSD 256GB", 35, 30, 390.75, true);
		Product prod6 = new Product("FlashDrive", 250, 40, 20.99, false);
		Product prod7 = new Product("Mouse", 22, 32, 98.99, true);
		Product prod8 = new Product("Teclado IBM", 8, 15, 120.00, true);
		
		List<Product> products = Arrays.asList(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8);
		
		System.out.println("** Free Delivery **");
		products.stream().filter(LambdasDesafio2.delivery).map(LambdasDesafio2.msg).forEach(LambdasDesafio2.print);
		
		System.out.println("\n ** OFF 30% **");
		products.stream().filter(LambdasDesafio2.discount).map(LambdasDesafio2.msg).forEach(LambdasDesafio2.print);
		System.out.println("\n==============================");
		System.out.println("\n ** COMBO **");
		products.stream()
				.filter(LambdasDesafio2.discount)
				.filter(LambdasDesafio2.delivery)
				.map(LambdasDesafio2.msg)
				.forEach(LambdasDesafio2.print);
	}
}
