package exercicios.classes;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object obj) {
		Usuario outroUsuario = (Usuario)obj;
		
		boolean nome = outroUsuario.nome.equals(this.nome);
		boolean email = outroUsuario.email.equals(this.email); 
		
		return nome && email;
			
	}
	
	public int hashCode() {
		return this.nome.length();
	}
}
