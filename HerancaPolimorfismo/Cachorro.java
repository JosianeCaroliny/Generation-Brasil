package HerancaPolimorfismo;

public class Cachorro extends Animais{
	@Override
	public void emitirSom()
	{
		System.out.println("Au Au");
	}
	
	@Override
	public void a��o()
	{
		System.out.println("brincando de correr!");
	}
	
	public Cachorro(String nome, int idade)
	{
		super(nome, idade);
	}

}
