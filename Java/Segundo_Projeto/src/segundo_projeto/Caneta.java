package segundo_projeto;

public class Caneta {
	public String modelo;
	private String cor;
	private float ponta;
	public boolean tampada;
	
	/* 
	  "  O 'get' pega e amostra o atributo "
	  "	 O 'set' configura/altera/modifica o atributo "
	*/
	
	// Métodos Getters e Setters
	public String getModelo() { return this.modelo; }
	public void setModelo(String m) {this.modelo=m; }
	
	public float getPonta() { return this.ponta; } 
	public void setPonta(float p)  { this.ponta = p; }
	
	public String getCor() { return this.cor; }
	public void setCor(String c) { this.cor = c; }
	
	public boolean getTampada() { return this.tampada;}
	public void setTampada(boolean t) { this.tampada=t;}
	
	//          Métodos
	public void tampar() { this.setTampada(true);}
	public void destampar() {this.setTampada(false);}
	
	//			Exibir
	public void Status() 
	{
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+this.getPonta());
		System.out.println("Cor: "+this.getCor());
		//System.out.println("Está tampada? "+ )
		
	}
	
	// Métodos Construtores
	
	public Caneta () 
	{
		this.setModelo("Defaut");
		this.setCor("#fff");
		this.setPonta(0.5f);
		this.tampar();
	}
	
	public Caneta (String m, String c, float p)
	{
		this.setModelo(m);
		this.setCor (c);
		this.setPonta (p) ;
	}
		
	
}
