package HerancaPolimorfismo;

public class Cavalo extends Animais{
	@Override
	public void emitirSom()
	{
		System.out.println("I���rrr");
	}
	
	@Override
	public void a��o()
	{
		System.out.println("brincando de correr!");
	}
	
	public Cavalo(String nome, int idade)
	{
		super(nome, idade);
	}
}
