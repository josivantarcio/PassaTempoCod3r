package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println(7 / scan.nextInt());
			scan.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Passando pelo finally()");
		}
		System.out.println("FIM");
	}
	
}
