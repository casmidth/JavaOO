
public class Agenda {

	public static void main(String[] args) {
		System.out.println("Agenda de contatos!");
		Contato contato = new Contato();
		contato.setNome("Catarina");
		contato.setTelefone("123456");
		
		System.out.println(contato.getNome());
		
		System.out.println(contato.imprimeTudao());
		
	}

}