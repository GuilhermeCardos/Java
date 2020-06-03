package exemploPratico05;
public class ContaBanco {
	
	public int numConta; protected String tipo; 
	private String dono; private float saldo; private boolean status;
	
	public int getNumConta() { return this.numConta; }
	public void setNumConta(int nc) { this.numConta=1+nc; }
	
	public String getTipo() {return this.tipo;}
	public void setTipo(String t) {this.tipo=t;}
	
	public String getDono() { return this.dono; }
	public void setDono(String d) {this.dono=d; }
	
	public float getSaldo() { return this.saldo;}
	public void setSaldo(float sal) { this.saldo=sal;}
	
	public boolean getStatus() { return this.status; }
	public void setStatus(boolean s) {this.status=s;}
	
		
	public void abrirConta(String nome, String tipo)
	{
		this.setNumConta(99);
		this.setTipo(tipo);
		this.setDono(nome);
		this.setStatus(true);
		
		if (this.getTipo() .equals("CC")) 
			{  this.setSaldo(50);  }
		else if(this.getTipo().contentEquals("CP"))
			{  this.setSaldo(150); }
				
		System.out.println( "Conta Aberta Com Sucesso. \nParabéns sr(a) "+ getDono());
	}
	
	public void fecharConta(int conta)
	{
		if(this.getNumConta() == conta) 
		{ 
			if(this.getSaldo() > 0 )
			{ 
				System.out.println("Sua Conta não pode ser Excluída!\n Saldo Positivo R$: "+this.getSaldo()); 
			}
			else if (this.getSaldo() < 0)
			{
				System.out.print("Sua Conta não pode ser Excluída!\n Saldo Negativo R$: "+this.getSaldo());
			}
			else 
			{ 
				this.setStatus(false); 
				System.out.println("Conta Excluída com Sucesso!"); 
			}
		}
		else
		{ System.out.println("Conta Inexistente"); }
		
	}
	
	public void depositar(float valor) 
	{
		if(this.getStatus() == true) 
		{
			this.setSaldo(this.getSaldo()+ valor);
			System.out.println("Saldo Atual R$: "+ getSaldo());
		}
		else 
		{ System.out.print("Não foi possivel depositar!"); } 
	}
	
	public void Sacar(float valor) 
	{
		if((this.getStatus() == true) && (this.getSaldo() > 0))
		{ 
			if(this.getSaldo()< valor) 
			{  System.out.println("Valor Maior do que está na conta! Valor R$:"+valor );	}
			else
			{ this.setSaldo(this.getSaldo() - valor);	}
			System.out.println("Saldo Atual R$: "+this.getSaldo());
		}
		
	}
	
	public void verConta () 
	{
		System.out.println("--------------------------------------");
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo R$: "+this.getSaldo());
		System.out.println("--------------------------------------");
	}
	
	public void pagarMensal() 
	{
		if(this.getTipo()=="CC")
		{    this.setSaldo(this.getSaldo() - 12);  }
		else if(this.getTipo()=="CP")
		{    this.setSaldo(this.getSaldo() - 20);  }
		
		System.out.println("Saldo Atual R$: "+this.getSaldo());
	}
	
	public ContaBanco() {};
	public ContaBanco(int nc, String tp, String dn, boolean s)
	{ this.setNumConta(nc); this.setTipo(tp); this.setDono(dn); this.setStatus(s);}
	
}
