package Modelo;

public class Mundo {

	private int numero;
	private int resultado;

	public Mundo() {
		this.numero = 1;
		this.resultado =0;
	}
	public void dividir(int dividiendo)
	{
		this.resultado = this.numero / dividiendo;
		System.out.println("El resulatdo de la division es : "+ numero);

	}


}