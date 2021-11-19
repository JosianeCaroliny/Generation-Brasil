package HerancaPolimorfismo;

public class TesteCavalo {
	
	public static void main(String[] args) {
		
		Animal cavalo = new Animal();
		cavalo.setNome("Galope");
		cavalo.setIdade(5);
		
		System.out.println("O nome do cavalo é "+ cavalo.getNome());
		System.out.println(cavalo.getNome() + " tem " + cavalo.getIdade() + " anos.");
		
		
		cavalo.emiteSom();
		System.out.println("Relinchando!");
		
		cavalo.correndo();
		System.out.println("Galopando");		
	}

}
