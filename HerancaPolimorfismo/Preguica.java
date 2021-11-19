package HerancaPolimorfismo;

public class Preguica extends Animais{
	@Override
	public void emitirSom()
	{
		System.out.println("ZZZzzzZZZ");
	}
	
	@Override
	public void ação()
	{
		System.out.println("subindo na árvore.!");
	}
	
	public Preguica(String nome, int idade)
	{
		super(nome, idade);
	}

}
