package HerancaPolimorfismo;

public class Animal {
	
	//ATRIBUTOS
	
	private String nome;
	private int idade;
	
	//M�TODOS
	
	public void emiteSom() 
	{
		System.out.println("Emitindo som...");
	}
	
	public void correndo()
	{
		System.out.println("Correndo...");
	}
	
	public void subindoNaArvore()
	{
		System.out.println("Est� subindo na �rvore!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
		
}
