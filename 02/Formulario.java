
public class Formulario {
	
	enum Genero {
		FEMININO('f'), MASCULINO('m');
		private char valor;
		Genero (char valor) {
			this.valor = valor;
		}
	}
	
	private String nome;
	private Genero genero;
}
