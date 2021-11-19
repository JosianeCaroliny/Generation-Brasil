package HerancaPolimorfismo;

public class Cavalo extends Animais{
	@Override
	public void emitirSom()
	{
		System.out.println("Iííírrr");
	}
	
	@Override
	public void ação()
	{
		System.out.println("brincando de correr!");
	}
	
	public Cavalo(String nome, int idade)
	{
		super(nome, idade);
	}
}
