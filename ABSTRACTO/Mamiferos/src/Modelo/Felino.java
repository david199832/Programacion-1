package Modelo;

public class Felino extends Mamifero
{
public Felino(String raza, int numPatas)
{
	super.raza=raza;
	super.numeropatas= numPatas;
}
	
	
	
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.print(" como carne, yummy, yummy");
	}

	@Override
	public void hacerSonido() {
		// TODO Auto-generated method stub
		System.out.print("miau,miau -- o depende");
		
	}

}
