package HerancaPolimorfismo;

public class CriarAnimais {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Totó", 2);
		Cavalo cav = new Cavalo("Spirit", 8);
		Preguica preg = new Preguica("Flash", 6);
		
		System.out.print("O nome do cachorro é " + dog.getNome() + ",  ele tem " + dog.getIdade() + " anos de idade e ele faz ");
		dog.emitirSom();
		System.out.print("O nome do cavalo é " + cav.getNome() + ", ele tem " + cav.getIdade() + " anos de idade e ele faz ");
		cav.emitirSom();
		System.out.print("O nome da preguiça é " + preg.getNome() + ", ela tem " + preg.getIdade() + " anos de idade e faz ");
		preg.emitirSom();
		
		
	}

}
