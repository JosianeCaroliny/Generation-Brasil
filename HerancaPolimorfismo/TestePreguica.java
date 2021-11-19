package HerancaPolimorfismo;

public class TestePreguica {
	
	public static void main(String[] args) {
		
		Animal pregui�a = new Animal();
		pregui�a.setNome("Flash");
		pregui�a.setIdade(5);
		
		System.out.println("O nome da pregui�a � "+ pregui�a.getNome());
		System.out.println(pregui�a.getNome() + " tem " + pregui�a.getIdade() + " anos.");
		
		pregui�a.emiteSom();
		System.out.println("Roncando... zZz");
		
		pregui�a.subindoNaArvore();
		System.out.println("Roncando enquanto sobe na �rvore.");
	}

}
