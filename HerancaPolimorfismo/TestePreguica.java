package HerancaPolimorfismo;

public class TestePreguica {
	
	public static void main(String[] args) {
		
		Animal preguiça = new Animal();
		preguiça.setNome("Flash");
		preguiça.setIdade(5);
		
		System.out.println("O nome da preguiça é "+ preguiça.getNome());
		System.out.println(preguiça.getNome() + " tem " + preguiça.getIdade() + " anos.");
		
		preguiça.emiteSom();
		System.out.println("Roncando... zZz");
		
		preguiça.subindoNaArvore();
		System.out.println("Roncando enquanto sobe na árvore.");
	}

}
