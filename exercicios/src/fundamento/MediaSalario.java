package fundamento;

import java.util.Locale;
import java.util.Scanner;

public class MediaSalario {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scan = new Scanner(System.in);
		
		System.out.print("salario do Primeiro: ");
		String sal1 = scan.nextLine().replace(",", ".");
		Double salario1 = Double.parseDouble(sal1);		
		
		System.out.print("Salario do Segundo: ");
		String sal2 = scan.nextLine().replace(",", ".");
		Double salario2 = Double.parseDouble(sal2);
		
		System.out.print("Salario do Terceiro: ");
		String sal3 = scan.nextLine().replace(",", ".");
		Double salario3 = Double.parseDouble(sal3);
		
		Double media = (salario1+salario2+salario3)/3;
		
		System.out.printf("Media : %.2f", media);
		
		
		
		
		
		
		
		
		scan.close();
	}
}
