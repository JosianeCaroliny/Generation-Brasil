package HerancaPolimorfismo;

public class TesteCachorro {
	
	public static void main(String [] args) {

		Animal cachorro = new Animal();
		cachorro.setNome("Totó");
		cachorro.setIdade(2);
		
		System.out.println("O nome do doguinho é " + cachorro.getNome());
		System.out.println(cachorro.getNome() + " tem " + cachorro.getIdade() + " anos.");
		
		cachorro.emiteSom();
		System.out.println("Au Au");
		
		cachorro.correndo();
	}

}
