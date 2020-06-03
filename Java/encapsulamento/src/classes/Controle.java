package classes;
import  interfacex.Controlador;
public class Controle implements Controlador{

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	private int getVolume() { return this.volume; }
	private void setVolume (int v) { this.volume = v;  }
	
	private boolean getLigado() { return this.ligado;  }
	private void setLigado(boolean l) { this.ligado=l; }
	
	private boolean getTocando() { return this.tocando;  }
	private void setTocando(boolean t) { this.tocando=t; } 
	
	
	//Métodos Construtores 
	
	public Controle() {this.setLigado(false);	this.setVolume(50); this.setTocando(false);}
	
	//SobreEscrevendo Métodos definidos na interface Controlador.
	
	public void ligar() 
	{ this.setLigado(true); }
	
	public void desligar() 
	{ this.setLigado(false); }
	
	public void abrirMenu() 
	{
		if(getLigado())
		{
			System.out.println("Ligado: "+this.getLigado());
			System.out.println("Tocando: "+this.getTocando());
			System.out.print("Volume: "+this.getVolume() + " -> ");
			
			for (int i = 0; i < this.getVolume(); i+=10 )
			{ System.out.print("|"); }
		} 
		
	}
	
	public void fecharMenu() 
	{	System.out.println("Fechando Menu!");  }
	
	public void maisVolume() 
	{
		//if ((this.getLigado()) && (this.getVolume() > 0) && (this.getVolume() < 100)) {}
		if(getLigado()) {
			this.setVolume(this.getVolume() + 10);
		}
		else {System.out.println("Desligado");}
	}
	
	public void menosVolume() 
	{
		if((this.getLigado()) && (this.getVolume()>0)) {
			this.setVolume(this.getVolume() -10);
		}
		else {System.out.println("Desligado ou Volume está no zero!");}
	}
	
	public void ligarMudo() 
	{
		if( (this.getLigado()) && (this.getVolume() > 0))
		{
			this.setVolume(0);
		}
		else { System.out.println("Deslido ou volume já está no mudo.");}
	}
	
	public void desligarMudo() 
	{
		if((this.getLigado()) && (this.getVolume() == 0))
		{
			this.setVolume(50);
		}
		else {	System.out.println("Desligado ou não está no mudo.");}
	}
	
	public void play () 
	{ 
		if ((this.getLigado()) && (!this.getTocando()))
		{
			this.setTocando(true);
		}
		else { System.out.print("Erro no Play");}
	}
	
	public void pause() 
	{
		if((this.getLigado()) && (this.getTocando()))
		{
			this.setTocando(false);
		}
		else {System.out.println("Erro no Pause");}
	}
		
	public void status () 
	{
		System.out.println("Ligado: "+getLigado());
		System.out.println("Volume: "+getVolume());
		System.out.println("Tocando: "+getTocando());
	}
		
		
		
		
		
		
		
		
		
		
}
