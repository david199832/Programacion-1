package Modelo;

public class Canino extends Mamifero 
{
	public Canino(String raza, int numPatas)
	{
		super.raza="French Poodle";
		super.numeropatas= numPatas;
	}
	
	
	

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.print("Como Concentrado, shhhhhh");
	}

	@Override
	public void hacerSonido() {
		// TODO Auto-generated method stub
		System.out.print("Guao,Guao");
		
	}

}
