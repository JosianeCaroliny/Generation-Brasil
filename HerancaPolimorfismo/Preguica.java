package HerancaPolimorfismo;

public class Preguica extends Animais{
	@Override
	public void emitirSom()
	{
		System.out.println("ZZZzzzZZZ");
	}
	
	@Override
	public void a��o()
	{
		System.out.println("subindo na �rvore.!");
	}
	
	public Preguica(String nome, int idade)
	{
		super(nome, idade);
	}

}
