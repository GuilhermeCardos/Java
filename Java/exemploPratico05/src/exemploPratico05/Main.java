package exemploPratico05;
public class Main 
{
	public static void main(String[] args) 
	{
		ContaBanco Conta = new ContaBanco();
		Conta.abrirConta("LUIZ GUILHERME", "CC");
		Conta.verConta();
		
		System.out.println(" ");
		Conta.pagarMensal();
		Conta.verConta();
			
		System.out.println(" ");
		Conta.Sacar(38);
		Conta.fecharConta(100);
	
	}

}
